package lk.ijse.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsersTransactionTM {
    private String bookId;
    private String name;
    private String borrowDate;
    private String returnDate;
}
