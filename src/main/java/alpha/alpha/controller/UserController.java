package alpha.alpha.controller;

import alpha.alpha.dto.UserDTO;
import alpha.alpha.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/signup")
    public UserDTO signUp(@RequestBody UserDTO user){
        userService.signUp(user);
        return user;
    }
}
