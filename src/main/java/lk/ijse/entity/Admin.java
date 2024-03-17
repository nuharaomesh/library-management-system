package lk.ijse.entity;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int admin_id;
    private String first_name;
    private String last_name;
    private String address;
    private String username;
    private String email;
    private String password;
    @OneToOne
    @JoinColumn (name = "branch_id")
    private Branch branch;
}
