package rs.milan.starter.foo.persistance;

import org.springframework.stereotype.Repository;
import rs.milan.starter.foo.common.NotFoundException;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BlogPostRepository {

    private final Map<String, BlogPostEntity> hashMap = new HashMap<>();
    private Long idCounter;

    @PostConstruct
    private void setup() {
        idCounter = 1L;
    }

    public BlogPostEntity createBlogPost(BlogPostEntity blogPostEntity) {
        synchronized (idCounter) {
            idCounter++;
            blogPostEntity.setId(idCounter.toString());
        }
        hashMap.put(blogPostEntity.getId(), blogPostEntity);

        return blogPostEntity;
    }

    public BlogPostEntity getBlogPost(String id) {
        BlogPostEntity blogPostEntity = hashMap.get(id);
        if (blogPostEntity == null) {
            throw new NotFoundException();
        }

        return blogPostEntity;
    }
}
