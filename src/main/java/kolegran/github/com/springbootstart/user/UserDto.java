package kolegran.github.com.springbootstart.user;

import lombok.Getter;

@Getter
public class UserDto {
    private final Long id;
    private final String login;

    public UserDto(User user){
        id = user.getId();
        login = user.getLogin();
    }
}
