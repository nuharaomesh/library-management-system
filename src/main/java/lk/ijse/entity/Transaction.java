package lk.ijse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transaction_id;
    private LocalDate borrow_date;
    private LocalDate return_date;
    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;
    @JoinColumn (name = "book_id")
    @ManyToOne
    private Book book;
}
