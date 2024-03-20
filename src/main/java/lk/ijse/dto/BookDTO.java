package lk.ijse.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {
    private String bookId;
    private String title;
    private String category;
    private String author;
    private String language;
    private String branch_id;
    private boolean status;

    public BookDTO(String title, String category, String author, String language, String branch_id) {
        this.title = title;
        this.category = category;
        this.author = author;
        this.language = language;
        this.branch_id = branch_id;
    }

    public BookDTO(String bookId, String title, String category, String author, boolean status) {
        this.bookId = bookId;
        this.title = title;
        this.category = category;
        this.author = author;
        this.status = status;
    }
}
