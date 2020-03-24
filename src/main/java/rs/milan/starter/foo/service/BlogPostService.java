package rs.milan.starter.foo.service;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import rs.milan.starter.foo.persistance.BlogPostEntity;
import rs.milan.starter.foo.persistance.BlogPostRepository;
import rs.milan.starter.foo.restapi.BlogPostRequest;
import rs.milan.starter.foo.restapi.BlogPostResponse;

@Service
@AllArgsConstructor
public class BlogPostService {

    private BlogPostRepository blogPostRepository;

    private final ModelMapper mapper;

    public BlogPostResponse createBlogPost(BlogPostRequest blogPostRequest) {
        BlogPostEntity blogPost =
                blogPostRepository.createBlogPost(mapper.map(blogPostRequest, BlogPostEntity.class));

        return mapper.map(blogPost, BlogPostResponse.class);
    }

    public BlogPostResponse getBlogPost(String id) {
        BlogPostEntity blogPost = blogPostRepository.getBlogPost(id);

        return mapper.map(blogPost, BlogPostResponse.class);
    }
}
