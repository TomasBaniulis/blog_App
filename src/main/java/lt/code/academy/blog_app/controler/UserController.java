package lt.code.academy.blog_app.controler;

import lombok.RequiredArgsConstructor;
import lt.code.academy.blog_app.dto.User;
import lt.code.academy.blog_app.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    @GetMapping("/create")
    public String openUserRegisterForm (Model model){
        model.addAttribute("user", new User());
        return "/form/user";
    }

    @PostMapping("/create")
    public String createUser (User user, Model model){
        userService.createUser(user);
        model.addAttribute("user", new User());
        model.addAttribute("message", "user created successfully");
        return "/form/user";

    }
}
