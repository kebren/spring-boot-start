package kolegran.github.com.springbootstart.user;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "my_users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String pass;
}
