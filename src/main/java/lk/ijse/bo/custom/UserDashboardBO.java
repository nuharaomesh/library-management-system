package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBO;
import lk.ijse.dto.BookDTO;
import lk.ijse.dto.TransactionDTO;

import java.util.List;

public interface UserDashboardBO extends SuperBO {
    List<BookDTO> getAllBooks();
    BookDTO searchBook(String title);
    boolean saveTransaction(TransactionDTO dto);
}
