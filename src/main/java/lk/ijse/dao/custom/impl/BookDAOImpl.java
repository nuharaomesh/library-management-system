package lk.ijse.dao.custom.impl;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.dao.custom.BookDAO;
import lk.ijse.entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class BookDAOImpl implements BookDAO {

    Session session = FactoryConfiguration.getInstance().getSession();
    @Override
    public boolean save(Book entity) {
        entity.setAvailable(true);
        Transaction transaction = session.beginTransaction();
        try {
            session.save(entity);
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

    @Override
    public List<Book> getAllUserBook() {
        Query<Book> query = session.createQuery("FROM Book WHERE available = true", Book.class);
        return query.list();
    }

    @Override
    public Book getABook(String title) {
        Query<Book> query = session.createQuery("FROM Book WHERE title = :title", Book.class);
        query.setParameter("title", title);
        return query.uniqueResult();
    }

    @Override
    public void updateBookStatus(boolean b) {

    }

    @Override
    public List<Book> getAllBooksAdmin(String branch_id) {
        Query<Book> query = session.createQuery("FROM Book WHERE branch.branch_id = :branchID", Book.class);
        query.setParameter("branchID", branch_id);
        return query.list();
    }
}
