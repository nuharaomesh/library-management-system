package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.AdminBookBO;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.AdminDAO;
import lk.ijse.dao.custom.BookDAO;
import lk.ijse.dto.BookDTO;
import lk.ijse.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class AdminBookBOImpl implements AdminBookBO {

    private BookDAO bookDAO = (BookDAO) DAOFactory.getDaoFactory().getTypes(DAOFactory.DAOTypes.BOOK);
    private AdminDAO adminDAO = (AdminDAO) DAOFactory.getDaoFactory().getTypes(DAOFactory.DAOTypes.ADMIN);

    @Override
    public boolean saveBook(BookDTO dto) {

        try {
            return bookDAO.save(new Book(dto.getTitle(), dto.getCategory(), dto.getAuthor(), dto.getLanguage(), dto.getBranch_id()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String getId(String EMAIL) {
        return adminDAO.getBranchId(EMAIL);
    }

    @Override
    public List<BookDTO> getAllBooks(String branchId) {
        List<Book> list = bookDAO.getAllBooksAdmin(branchId);
        List<BookDTO> dtoList = new ArrayList<>();
        for (Book entity: list) {
            dtoList.add(
                    new BookDTO(
                        String.valueOf(entity.getBook_id()),
                        entity.getTitle(),
                        entity.getGenre(),
                        entity.getAuthor(),
                        entity.isAvailable()
                    )
            );
        }
        return dtoList;
    }

    @Override
    public String getAdminBranchId(String email) {
        return adminDAO.getBranchId(email);
    }
}
