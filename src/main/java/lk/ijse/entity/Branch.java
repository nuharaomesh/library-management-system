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
    private String contact;
    private boolean branch_closed;
    @ManyToMany
    @JoinTable (
            name = "Book_Details",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "branch_id")
    )
    private List<Book> books;
}
