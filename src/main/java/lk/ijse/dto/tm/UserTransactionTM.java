package lk.ijse.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserTransactionTM {
    private String bookId;
    private String branchName;
    private String title;
    private String category;
    private String borrowedDate;
    private String returnedDate;
}
