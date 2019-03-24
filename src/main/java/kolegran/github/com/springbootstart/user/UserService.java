package kolegran.github.com.springbootstart.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository UserRepository;

    @Transactional
    public UserDto create(UserCommand command){
        User user = new User();

        user.setLogin(command.getLogin());
        user.setPass(command.getPass());
        return new UserDto(UserRepository.save(user));
    }

    @Transactional(readOnly = true)
    public UserDto getById(Long userId){
        return new UserDto(UserRepository.getOne(userId));
    }
}
