package lt.code.academy.blog_app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.code.academy.blog_app.entity.CommentEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private UUID commentId;
    private String commentText;
    private LocalDateTime commentDate;

    public static Comment convertComment (CommentEntity commentEntity){
        return  new Comment(
                commentEntity.getCommentId(),
                commentEntity.getCommentText(),
                commentEntity.getCommentDate()
        );
    }
}
