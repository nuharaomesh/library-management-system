package lk.ijse.dao.custom.impl;

import lk.ijse.dao.custom.BookDetailsDAO;
import lk.ijse.entity.Custom;
import org.hibernate.Session;

import java.util.List;

public class BookDetailsDAOImpl implements BookDetailsDAO {
    @Override
    public boolean save(Custom entity) {
        return false;
    }

    @Override
    public boolean update(Custom entity) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Custom search(Custom entity) {
        return null;
    }

    @Override
    public List<Custom> getAll() {
        return null;
    }
}
