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
    private String author;
    private String language;
    private boolean returned;
    private int count;
    @OneToMany (mappedBy = "book")
    private List<Transaction> transactions;
    @ManyToOne
    @JoinColumn (name = "branch_id")
    private Branch branch;
    public Book(String title, String genre, String author, String language, boolean returned, int count) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.language = language;
        this.returned = returned;
        this.count = count;
    }
}
