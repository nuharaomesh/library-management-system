package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBO;
import lk.ijse.dto.BranchDTO;

import java.sql.SQLException;

public interface AdminBranchBO extends SuperBO {
    boolean saveBranch(BranchDTO branchDto);
    String genId() throws SQLException;
}
