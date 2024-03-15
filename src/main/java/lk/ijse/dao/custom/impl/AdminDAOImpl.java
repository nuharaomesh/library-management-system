package lk.ijse.dao.custom.impl;

import lk.ijse.dao.custom.AdminDAO;
import lk.ijse.entity.Admin;
import org.hibernate.Session;

import java.util.List;

public class AdminDAOImpl implements AdminDAO {
    @Override
    public boolean save(Admin entity) {
        return false;
    }

    @Override
    public boolean update(Admin entity) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Admin search(Admin entity) {
        return null;
    }

    @Override
    public List<Admin> getAll() {
        return null;
    }
}
