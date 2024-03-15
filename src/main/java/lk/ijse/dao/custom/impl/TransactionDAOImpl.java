package lk.ijse.dao.custom.impl;

import lk.ijse.dao.custom.TransactionDAO;
import lk.ijse.entity.Transaction;
import org.hibernate.Session;

import java.util.List;

public class TransactionDAOImpl implements TransactionDAO {
    @Override
    public boolean save(Transaction entity) {
        return false;
    }

    @Override
    public boolean update(Transaction entity) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Transaction search(Transaction entity) {
        return null;
    }

    @Override
    public List<Transaction> getAll() {
        return null;
    }
}
