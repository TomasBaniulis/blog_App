package lt.code.academy.blog_app.repository;

import lt.code.academy.blog_app.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommentRepository extends JpaRepository <CommentEntity, UUID> {
}
