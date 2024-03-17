package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.AdminLoginBO;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.AdminDAO;
import lk.ijse.dto.AdminDTO;
import lk.ijse.entity.Admin;

public class AdminLoginBOImpl implements AdminLoginBO {

    private AdminDAO adminDAO = (AdminDAO) DAOFactory.getDaoFactory().getTypes(DAOFactory.DAOTypes.ADMIN);

    @Override
    public boolean checkCredential(AdminDTO dto) {
        return adminDAO.checkCredential(new Admin(dto.getEmail(), dto.getPassword()));
    }
}
