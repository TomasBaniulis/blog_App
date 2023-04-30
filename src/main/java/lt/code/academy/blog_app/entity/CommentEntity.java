package lt.code.academy.blog_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
}
