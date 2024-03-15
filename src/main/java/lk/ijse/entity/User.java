package lk.ijse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int user_id;
    private String first_name;
    private String last_name;
    private String username;
    private String email;
    private String password;
    @OneToMany (mappedBy = "user")
    private List<Transaction> transactions;

    public User(String first_name, String last_name, String username, String email, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
