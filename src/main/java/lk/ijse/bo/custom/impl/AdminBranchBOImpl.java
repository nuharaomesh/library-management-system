package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.AdminBranchBO;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.AdminDAO;
import lk.ijse.dao.custom.BranchDAO;
import lk.ijse.dto.BranchDTO;
import lk.ijse.entity.Branch;

import java.sql.SQLException;

public class AdminBranchBOImpl implements AdminBranchBO {

    private BranchDAO branchDAO = (BranchDAO) DAOFactory.getDaoFactory().getTypes(DAOFactory.DAOTypes.BRANCH);

    @Override
    public boolean saveBranch(BranchDTO dto) {
        return branchDAO.save(new Branch(dto.getBranchId(), dto.getBranchName(), dto.getAddress(), dto.getContact()));
    }

    @Override
    public String genId() throws SQLException {
        return branchDAO.genId();
    }
}
