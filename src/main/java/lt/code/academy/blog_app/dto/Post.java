package lt.code.academy.blog_app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.code.academy.blog_app.entity.CommentEntity;
import lt.code.academy.blog_app.entity.PostEntity;

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
    List<Comment> comments;

    public static Post converPost (PostEntity postEntity){
        return new Post(
                postEntity.getPostId(),
                postEntity.getPostName(),
                postEntity.getPostText(),
                postEntity.getPostDate(),
                convertList(postEntity.getComments())
        );
    }

    public static List<Comment> convertList (List<CommentEntity>comments){
        return comments.stream().map(Comment::convertComment).toList();
    }
}
