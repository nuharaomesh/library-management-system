package lk.ijse.dao.custom.impl;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.dao.custom.UserDAO;
import lk.ijse.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    FactoryConfiguration factory = FactoryConfiguration.getInstance();

    @Override
    public boolean save(User entity) {
        Session session = factory.getSession();
        Transaction transaction = session.beginTransaction();

        try {

            session.save(entity);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(User entity) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public User search(User entity) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
