package kolegran.github.com.springbootstart.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/")
    public UserDto createUser(
            @RequestParam(name = "login", required = false, defaultValue = "login") String login,
            @RequestParam(name = "pass", required = false, defaultValue = "pass") String pass
            ) {
        UserCommand command = new UserCommand(login, pass);
        return userService.create(command);
    }

    @GetMapping("/{userId}")
    public UserDto getUserById(@PathVariable Long userId){
        return userService.getById(userId);
    }
}

