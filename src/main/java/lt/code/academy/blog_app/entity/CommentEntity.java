package lt.code.academy.blog_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.code.academy.blog_app.dto.Comment;
import lt.code.academy.blog_app.dto.Post;
import org.hibernate.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comments")
public class CommentEntity {
    @Id
    @GeneratedValue
    @Column (updatable = false)
    private UUID commentId;
    @Column (nullable = false,length = 200)
    private String commentText;
    @Column (updatable = false, nullable = false)
    private LocalDateTime commentDate;
    @Column (updatable = false, length=25)
    private String username;

    public  static CommentEntity convert (Comment comment) {
        return new CommentEntity(
                comment.getCommentId(),
                comment.getCommentText(),
                comment.getCommentDate(),
                comment.getUsername()
        );
    }
}
