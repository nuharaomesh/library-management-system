package lk.ijse.dao.custom;

import lk.ijse.dao.CrudDAO;
import lk.ijse.entity.Admin;

public interface AdminDAO extends CrudDAO<Admin> {
    boolean checkCredential(Admin entity);
    String getBranchId(String EMAIL);
}
