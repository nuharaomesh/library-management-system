package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Admin {

    @Id
    private String admin_id;
    private String first_name;
    private String last_name;
    private String username;
    private String email;
    private String password;
}
