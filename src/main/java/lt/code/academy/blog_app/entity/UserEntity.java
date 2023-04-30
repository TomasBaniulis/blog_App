package lt.code.academy.blog_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class UserEntity {
@Id
@GeneratedValue
@Column(updatable = false)
private UUID userID;
@Column (nullable = false, length = 20)
private String name;
@Column (nullable = false, length = 20)
private String surname;
@Column (nullable = false, length = 20)
private String username;
@Column (nullable = false, length = 10)
private String password;
@Column (nullable = false, length = 30)
private String email;
@Column (length = 100)
private String avatar;
@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CommentEntity> comments;
}
