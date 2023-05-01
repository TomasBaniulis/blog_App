package lt.code.academy.blog_app.service;

import lombok.RequiredArgsConstructor;
import lt.code.academy.blog_app.dto.Post;
import lt.code.academy.blog_app.entity.PostEntity;
import lt.code.academy.blog_app.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;


    public void createPost (Post post) {
        postRepository.save(PostEntity.convert(post));
    }

    public void updatePost (Post post){
        postRepository.save(PostEntity.convert(post));
    }

    public  void deletePost (UUID postID){
        postRepository.deleteById(postID);
    }

    public List<Post> getAllPosts (){
        return  postRepository.findAll().stream().map(Post::converPost).toList();
    }

    public Post getPostById (UUID postId){
        return Post.converPost(postRepository.findByPostId(postId));

    }
}
