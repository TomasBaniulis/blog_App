package lt.code.academy.blog_app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    private List<Role> userRoles;
}
