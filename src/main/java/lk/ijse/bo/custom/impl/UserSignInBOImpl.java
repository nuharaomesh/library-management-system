package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.UserSignInBo;
import lk.ijse.config.FactoryConfiguration;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.UserDAO;
import lk.ijse.dto.UserDTO;
import lk.ijse.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserSignInBOImpl implements UserSignInBo {

    private UserDAO userDAO = (UserDAO) DAOFactory.getDaoFactory().getTypes(DAOFactory.DAOTypes.USER);

    @Override
    public boolean saveUser(UserDTO dto) {
        return userDAO.save(new User(dto.getFirst_name(), dto.getLast_name(), dto.getUsername(), dto.getEmail(), dto.getPassword()));
    }
}
