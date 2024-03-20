package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.UserDashboardBO;
import lk.ijse.config.FactoryConfiguration;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.BookDAO;
import lk.ijse.dao.custom.TransactionDAO;
import lk.ijse.dto.BookDTO;
import lk.ijse.dto.TransactionDTO;
import lk.ijse.entity.Book;
import lk.ijse.entity.Transaction;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class UserDashboardBOImpl implements UserDashboardBO {

    private BookDAO bookDAO = (BookDAO) DAOFactory.getDaoFactory().getTypes(DAOFactory.DAOTypes.BOOK);
    private TransactionDAO transactionDAO = (TransactionDAO) DAOFactory.getDaoFactory().getTypes(DAOFactory.DAOTypes.TRANSACTION);

    @Override
    public List<BookDTO> getAllBooks() {
        List<Book> list = bookDAO.getAllUserBook();
        List<BookDTO> dtoList = new ArrayList<>();

        for (Book entity: list) {
            dtoList.add(
                    new BookDTO(
                            entity.getTitle(),
                            entity.getAuthor(),
                            entity.getGenre(),
                            entity.getLanguage(),
                            entity.isAvailable()
                    )
            );
        }
        return dtoList;
    }

    @Override
    public BookDTO searchBook(String title) {
        Book entity = bookDAO.getABook(title);
        return new BookDTO(String.valueOf(entity.getBook_id()), entity.getTitle(), entity.getGenre(), entity.getAuthor(), entity.getLanguage(), entity.getBranch().getBranch_id(), entity.isAvailable());
    }

    @Override
    public boolean saveTransaction(TransactionDTO dto) {
        Session session = FactoryConfiguration.getInstance().getSession();
        org.hibernate.Transaction transaction = session.beginTransaction();

        try {
            transactionDAO.save(new Transaction());
            bookDAO.updateBookStatus(false);
        } catch (Exception e) {
            transaction.rollback();
        }
        return false;
    }
}
