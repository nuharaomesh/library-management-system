package lk.ijse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

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
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private String language;
    @ColumnDefault("true")
    @Column(nullable = false)
    private boolean available;
    @OneToMany (mappedBy = "book")
    private List<Transaction> transactions;
    @ManyToOne
    @JoinColumn (name = "branch_id")
    private Branch branch;

    public Book(String title, String genre, String author, String language, String branch_id) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.language = language;
        branch = new Branch();
        branch.setBranch_id(branch_id);
    }
}
