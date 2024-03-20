package lk.ijse.dao.custom;

import lk.ijse.dao.CrudDAO;
import lk.ijse.entity.Book;

import java.util.List;

public interface BookDAO extends CrudDAO<Book> {
    List<Book> getAllBooksAdmin(String branch_id);
    List<Book> getAllUserBook();
    Book getABook(String title);
    void updateBookStatus(boolean b);
}
