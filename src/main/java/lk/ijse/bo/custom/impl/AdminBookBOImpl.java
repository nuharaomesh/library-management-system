package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.AdminBookBO;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.AdminDAO;
import lk.ijse.dao.custom.BookDAO;
import lk.ijse.dto.BookDTO;
import lk.ijse.entity.Book;

public class AdminBookBOImpl implements AdminBookBO {

    private BookDAO bookDAO = (BookDAO) DAOFactory.getDaoFactory().getTypes(DAOFactory.DAOTypes.BOOK);

    @Override
    public boolean saveBook(BookDTO dto) {

        try {
            return bookDAO.save(new Book(dto.getTitle(), dto.getCategory(), dto.getAuthor(), dto.getLanguage()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
