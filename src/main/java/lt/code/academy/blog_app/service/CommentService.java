package lt.code.academy.blog_app.service;

import lombok.RequiredArgsConstructor;
import lt.code.academy.blog_app.dto.Comment;
import lt.code.academy.blog_app.dto.Post;
import lt.code.academy.blog_app.entity.CommentEntity;
import lt.code.academy.blog_app.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public void createComment (Comment comment){
        commentRepository.save(CommentEntity.convert(comment));
    }

    public void updateComment (Comment comment){
        commentRepository.save(CommentEntity.convert(comment));
    }

    public void deleteComment (UUID commentId){
        commentRepository.deleteById(commentId);
    }

}
