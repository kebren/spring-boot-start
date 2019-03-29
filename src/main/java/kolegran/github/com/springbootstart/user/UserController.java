package kolegran.github.com.springbootstart.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("api/users")
    public UserDto createUser(@RequestBody UserCommand command) {
        return userService.create(command);
    }

    @GetMapping("api/users/{userId}")
    public UserDto getUserById(@PathVariable Long userId){
        return userService.getById(userId);
    }
}

