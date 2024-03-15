package lk.ijse.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsersBookNotReturnedTM {
    private String bookId;
    private String name;
    private String title;
    private String branchName;
    private String borrowDate;
    private String dueDate;
}
