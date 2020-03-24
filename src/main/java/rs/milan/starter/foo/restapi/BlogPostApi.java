package rs.milan.starter.foo.restapi;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;
import rs.milan.starter.foo.service.BlogPostService;

import javax.validation.Valid;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * You may also check out Spring REST docs
 * <a href="https://spring.io/projects/spring-restdocs">https://spring.io/projects/spring-restdocs</a>,
 * a convenient way to generate human-readable documentation besides Swagger
 * <p>
 * NOTE: Controller sends back in response the DTO it received from the service.
 * This is not a 'clean' as we would have to create a separate FooResponse class in order to stay loosely-coupled.
 * Reason why I followed above-mentioned approach is because we will avoid having bunch of duplicate classes (DTO and response counterparts)
 * When situation demands to have a separately defined response class we can easily introduce it, e.g. one API endpoint combing multiple service responses.
 */

@Tag(name = "Blog Posts", description = "Blog Posts API")
@RestController
@AllArgsConstructor
@RequestMapping("/blog-posts")
public class BlogPostApi {

    private final BlogPostService blogPostService;

    @Operation(summary = "Get Blog Post")
    @GetMapping
    public Callable<BlogPostResponse> getBlogPost(@RequestParam("id") String id) {
        return () -> blogPostService.getBlogPost(id);
    }

    @Operation(summary = "Create a Blog Post")
    @PostMapping
    public Callable<BlogPostResponse> createBlogPost(@Valid @RequestBody BlogPostRequest blogPostRequest) {
        return () -> blogPostService.createBlogPost(blogPostRequest);
    }
}
