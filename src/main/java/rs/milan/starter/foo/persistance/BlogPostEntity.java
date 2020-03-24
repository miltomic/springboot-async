package rs.milan.starter.foo.persistance;

import lombok.Data;

import java.util.Date;

@Data
public class BlogPostEntity {

    private String id;

    private String author;

    private String title;

    private String content;

    private Date date;
}
