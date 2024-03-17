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

    public Admin(String first_name, String last_name, String address, String username, String email, String password, String branch_id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.username = username;
        this.email = email;
        this.password = password;
        branch.setBranch_id(branch_id);
    }

    public Admin(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
