package kolegran.github.com.springbootstart.user;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;

@Data
public class UserCommand {
    @NotNull
    @Length(min = 2, max = 20)
    private String login;

    @NotNull
    @Length(min = 6, max = 20)
    private String pass;
}

