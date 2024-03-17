package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.AdminSignInBO;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.AdminDAO;
import lk.ijse.dto.AdminDTO;
import lk.ijse.entity.Admin;

import javax.swing.text.html.parser.Entity;

public class AdminSignInBOImpl implements AdminSignInBO {

    private AdminDAO adminDAO = (AdminDAO) DAOFactory.getDaoFactory().getTypes(DAOFactory.DAOTypes.ADMIN);

    @Override
    public boolean saveAdmin(AdminDTO dto) {
        return adminDAO.save(new Admin(dto.getFirstName(), dto.getLastName(), dto.getAddress(), dto.getUsername(), dto.getEmail(), dto.getPassword(), dto.getBranchId()));
    }
}
