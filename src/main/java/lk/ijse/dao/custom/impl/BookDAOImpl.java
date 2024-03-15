package lk.ijse.dao.custom.impl;

import lk.ijse.dao.custom.BookDAO;
import lk.ijse.entity.Book;
import org.hibernate.Session;

import java.util.List;

public class BookDAOImpl implements BookDAO {
    @Override
    public boolean save(Book entity) {
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
