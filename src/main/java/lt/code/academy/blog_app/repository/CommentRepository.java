package lt.code.academy.blog_app.repository;

import lt.code.academy.blog_app.dto.Comment;
import lt.code.academy.blog_app.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface CommentRepository extends JpaRepository <CommentEntity, UUID> {

}
