package lk.ijse.dao.custom.impl;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.dao.custom.UserDAO;
import lk.ijse.entity.Admin;
import lk.ijse.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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

    @Override
    public String getId(String email) {
        Session session = factory.getSession();

        Query query = session.createQuery("FROM User WHERE email= :email");
        query.setParameter("email", email);
        Admin admin = (Admin) query.uniqueResult();
        return String.valueOf(admin.getAdmin_id());
    }
}
