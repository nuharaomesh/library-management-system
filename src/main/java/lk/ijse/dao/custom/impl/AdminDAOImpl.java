package lk.ijse.dao.custom.impl;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.dao.custom.AdminDAO;
import lk.ijse.entity.Admin;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class AdminDAOImpl implements AdminDAO {

    Session session = FactoryConfiguration.getInstance().getSession();

    @Override
    public boolean save(Admin entity) {
        Transaction transaction = session.beginTransaction();

        try {

            Query query = session.createNativeQuery("INSERT INTO Admin (admin_id, address, email, first_name, last_name, password, username, branch_id) VALUES (:admin_id, :address, :email, :first_name, :last_name, :password, :username, :branch_id)");
            query.setParameter("admin_id", entity.getAdmin_id());
            query.setParameter("address", entity.getAddress());
            query.setParameter("email", entity.getEmail());
            query.setParameter("first_name", entity.getFirst_name());
            query.setParameter("last_name", entity.getLast_name());
            query.setParameter("password", entity.getPassword());
            query.setParameter("username", entity.getUsername());
            query.setParameter("branch_id", entity.getBranch().getBranch_id());

            query.executeUpdate();
            transaction.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    @Override
    public boolean checkCredential(Admin entity) {
        Query<Admin> query = session.createQuery("FROM Admin WHERE email = :email", Admin.class);
        query.setParameter("email", entity.getEmail());

        try {
            Admin admin = query.uniqueResult();
            if (admin.getPassword().equals(entity.getPassword())) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
