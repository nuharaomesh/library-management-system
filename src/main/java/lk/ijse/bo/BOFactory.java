package lk.ijse.bo;

import lk.ijse.bo.custom.impl.*;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getBOFactory() {
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOTypes {
        ADMIN_LOGIN,ADMIN_SIGN_IN,ADMIN_DASHBOARD,ADMIN_BOOK,ADMIN_BRANCH,USER_LOGIN,USER_SIGN_IN,USER_DASHBOARD
    }

    public SuperBO getTypes(BOTypes boTypes) {

        switch (boTypes) {
            case ADMIN_LOGIN:
                return new AdminLoginBOImpl();
            case ADMIN_SIGN_IN:
                return new AdminSignInBOImpl();
            case ADMIN_DASHBOARD:
                return new AdminDashboardBOImpl();
            case ADMIN_BOOK:
                return new AdminBookBOImpl();
            case ADMIN_BRANCH:
                return new AdminBranchBOImpl();
            case USER_LOGIN:
                return new UserLoginBOImpl();
            case USER_SIGN_IN:
                return new UserSignInBOImpl();
            case USER_DASHBOARD:
                return new UserDashboardBOImpl();
            default:
                return null;
        }
    }
}
