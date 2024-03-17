package lk.ijse.dao.custom.impl;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.dao.custom.BranchDAO;
import lk.ijse.entity.Branch;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.List;

public class BranchDAOImpl implements BranchDAO {

    Session session = FactoryConfiguration.getInstance().getSession();
    @Override
    public boolean save(Branch entity) {
        Transaction transaction = session.beginTransaction();

        try {
            session.save(entity);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
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

    @Override
    public String genId() throws SQLException {

        Query<String> query = session.createQuery("SELECT branch_id FROM Branch ORDER BY branch_id DESC LIMIT 1");
        String branchId = query.uniqueResult();

        System.out.println(branchId);
        System.out.println("sadasd");
        if (branchId != null) {
            int branch_id = Integer.valueOf(branchId.replace("B00-", "")) + 1;
            return String.format("B00-%03d", branch_id);
        }
        return "B00-001";
    }
}
