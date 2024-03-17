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
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int branch_id;
    private String branch_name;
    private String branch_address;
    private int contact;
    private boolean branch_closed;
    @OneToOne (mappedBy = "branch")
    private Admin admin;
    @OneToMany (mappedBy = "branch")
    private List<Book> books;
}
