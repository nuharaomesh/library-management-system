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
public class Book {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int book_id;
    private String title;
    private String genre;
    private String Author;
    private boolean returned;
    @OneToMany (mappedBy = "book")
    private List<Transaction> transactions;
    @ManyToMany (mappedBy = "books")
    private List<Branch> branches;
}
