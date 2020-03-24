package rs.milan.starter.foo.restapi;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Date;

@Data
@NoArgsConstructor
@Schema(name = "Blog Post Request", description = "A Blog Post Request")
public class BlogPostRequest {

    @Schema(description = "Name of the author", required = true, example = "John Smith")
    @JsonProperty("author")
    @NotEmpty
    private String author;

    @Schema(description = "Blog Title", required = true, example = "Sample Title")
    @JsonProperty("title")
    @NotEmpty
    private String title;

    @Schema(description = "Blog Content", required = true, example = "Some fancy content")
    @JsonProperty("content")
    @NotEmpty
    private String content;

    @Schema(description = "Published Date in UTC", required = true, example = "dd-MM-yyyy")
    @JsonProperty("date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    @NotNull
    private Date date;
}
