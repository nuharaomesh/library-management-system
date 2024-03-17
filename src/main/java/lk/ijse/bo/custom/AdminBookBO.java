package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBO;
import lk.ijse.dto.BookDTO;

import java.sql.SQLException;

public interface AdminBookBO extends SuperBO {
    boolean saveBook(BookDTO dto);
    String getId(String EMAIL);
}
