package lk.ijse.dao;

import lk.ijse.dao.custom.impl.*;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory() {}

    public static DAOFactory getDaoFactory() {
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DAOTypes {
        ADMIN,BOOK,BOOK_DETAILS,BRANCH,TRANSACTION,USER
    }

    public SuperDAO getTypes(DAOTypes daoTypes) {

        switch (daoTypes) {
            case ADMIN:
                return new AdminDAOImpl();
            case BOOK:
                return new BookDAOImpl();
            case BOOK_DETAILS:
                return new BookDetailsDAOImpl();
            case BRANCH:
                return new BranchDAOImpl();
            case TRANSACTION:
                return new TransactionDAOImpl();
            case USER:
                return new UserDAOImpl();
            default:
                return null;
        }
    }
}
