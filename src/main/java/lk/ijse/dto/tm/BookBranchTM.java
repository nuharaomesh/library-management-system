package lk.ijse.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookBranchTM {
    private String branchId;
    private String branchName;
    private String address;
    private String bookCount;
    private String branchTel;
}
