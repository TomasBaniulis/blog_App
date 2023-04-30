package lt.code.academy.blog_app.service;

import lombok.RequiredArgsConstructor;
import lt.code.academy.blog_app.dto.User;
import lt.code.academy.blog_app.entity.UserEntity;
import lt.code.academy.blog_app.repository.PostRepository;
import lt.code.academy.blog_app.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public void createUser (User user){
        userRepository.save(UserEntity.convert(user));
    }

    public void updateUser (User user){
        userRepository.save(UserEntity.convert(user));
    }

    public  void deleteUser (UUID userId){
        userRepository.deleteById(userId);
    }

    public List<User> getAllUsers (){
        return userRepository.findAll().stream().map(User::converUser).toList();
    }


}
