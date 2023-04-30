package lt.code.academy.blog_app.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.code.academy.blog_app.dto.Comment;
import lt.code.academy.blog_app.dto.Post;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class PostEntity {
    @Id
    @GeneratedValue
    @Column(updatable = false)
    private UUID postId;
    @Column(nullable = false, length = 100)
    private String postName;
    @Column(nullable = false, length = 500)
    private String postText;
    @Column(nullable = false)
    private LocalDate postDate;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List <CommentEntity> comments;

    public static PostEntity convert ( Post post) {
        return new PostEntity(
                post.getPostId(),
                post.getPostName(),
                post.getPostText(),
                post.getPostDate(),
                convertToList(post.getComments())
        );
    }

    public static List <CommentEntity> convertToList (List <Comment> comments){
        return comments.stream().map(CommentEntity::convert).toList();
    }
}
