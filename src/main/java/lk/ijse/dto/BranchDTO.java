package lk.ijse.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BranchDTO {
    private String branchName;
    private String address;
    private int contact;
    private boolean branchClosed;
}
