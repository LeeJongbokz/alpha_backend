package alpha.alpha.controller;

import alpha.alpha.dto.UserDTO;
import alpha.alpha.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping
    public void signUp(UserDTO user){
        System.out.println("hello");
        userService.signUp(user);
    }
}
