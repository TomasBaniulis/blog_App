package lt.code.academy.blog_app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private UUID postId;
    private String postName;
    private String postText;
    private LocalDate postDate;
    private List<Comment> comments;
}
