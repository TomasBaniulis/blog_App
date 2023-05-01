package lt.code.academy.blog_app.repository;

import lt.code.academy.blog_app.dto.Post;
import lt.code.academy.blog_app.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PostRepository extends JpaRepository<PostEntity, UUID> {

    PostEntity findByPostId(UUID id);
}
