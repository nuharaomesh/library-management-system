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
public class Branch {

    @Id
    private String branch_id;
    private String branch_name;
    private String branch_address;
    private int contact;
    private boolean branch_closed;
    @OneToOne (mappedBy = "branch")
    private Admin admin;
    @OneToMany (mappedBy = "branch")
    private List<Book> books;

    public Branch(String branch_id, String branch_name, String branch_address, int contact) {
        this.branch_id = branch_id;
        this.branch_name = branch_name;
        this.branch_address = branch_address;
        this.contact = contact;
    }
}
