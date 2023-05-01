package lt.code.academy.blog_app.controler;

import lombok.RequiredArgsConstructor;
import lt.code.academy.blog_app.dto.Comment;
import lt.code.academy.blog_app.dto.Post;
import lt.code.academy.blog_app.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Controller
@RequestMapping("/blog")
public class PostController {

    private final PostService postService;

    @GetMapping
    public String showAllPosts (Model model){
        model.addAttribute("posts", postService.getAllPosts());
        return "blog";
    }
    @GetMapping("/create")
    public String openPostCreateForm (Model model){
        model.addAttribute("post", new Post());
        return "/form/post";
    }
    @PostMapping("/create")
    public String createPost (Post post, Model model) {
        List<Comment> comments = new ArrayList<>();
        post.setPostDate(LocalDate.now());
        post.setComments(comments);
        postService.createPost(post);
        model.addAttribute("post", new Post());
        model.addAttribute("message", "Post created successfully");
        return "/form/post";

    }
    @GetMapping("/{postId}")
    public String showSinglePost (@PathVariable UUID postId, Model model){
        model.addAttribute("post", postService.getPostById(postId));
        return "singlePost";
    }



}
