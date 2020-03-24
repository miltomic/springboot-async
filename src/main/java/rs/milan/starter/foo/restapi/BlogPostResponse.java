package rs.milan.starter.foo.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Schema(name = "Blog Post Response", description = "A Blog Post Response")
public class BlogPostResponse extends BlogPostRequest {

    @Schema(description = "Public ID of the blog post", required = true)
    @JsonProperty("id")
    private String id;
}
