package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.UserLoginBo;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.UserDAO;

public class UserLoginBOImpl implements UserLoginBo {

    private UserDAO userDAO = (UserDAO) DAOFactory.getDaoFactory().getTypes(DAOFactory.DAOTypes.USER);
    @Override
    public String getId(String email) {
        return userDAO.getId(email);
    }
}
