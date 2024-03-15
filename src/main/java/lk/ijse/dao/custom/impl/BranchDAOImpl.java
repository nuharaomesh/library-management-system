package lk.ijse.dao.custom.impl;

import lk.ijse.dao.custom.BranchDAO;
import lk.ijse.entity.Branch;
import org.hibernate.Session;

import java.util.List;

public class BranchDAOImpl implements BranchDAO {
    @Override
    public boolean save(Branch entity) {
        return false;
    }

    @Override
    public boolean update(Branch entity) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Branch search(Branch entity) {
        return null;
    }

    @Override
    public List<Branch> getAll() {
        return null;
    }
}
