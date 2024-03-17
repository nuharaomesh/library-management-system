package lk.ijse.dao.custom.impl;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.dao.custom.BookDAO;
import lk.ijse.entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BookDAOImpl implements BookDAO {

    Session session = FactoryConfiguration.getInstance().getSession();
    @Override
    public boolean save(Book entity) {
        Transaction transaction = session.beginTransaction();
        try {
            session.save(entity);
            System.out.println("mn awa");
            transaction.commit();
            session.close();
            return true;
        } catch (Exception e) {
            transaction.rollback();
        }
        return false;
    }

    @Override
    public boolean update(Book entity) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Book search(Book entity) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }
}
