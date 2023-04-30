package lt.code.academy.blog_app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.code.academy.blog_app.entity.UserEntity;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private UUID id;
    private String name;
    private String surname;
    private String userName;
    private String password;
    private String email;
    private String avatar;
    private List <Comment> comments;


    public static User converUser (UserEntity userEntity){
        return new User(
                userEntity.getUserID(),
                userEntity.getName(),
                userEntity.getSurname(),
                userEntity.getUsername(),
                userEntity.getPassword(),
                userEntity.getEmail(),
                userEntity.getAvatar(),
                Post.convertList(userEntity.getComments())
        );
    }
}
