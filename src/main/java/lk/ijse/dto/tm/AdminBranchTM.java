package lk.ijse.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdminBranchTM {
    private String branchId;
    private String branchName;
    private String address;
    private String branchTel;
}
