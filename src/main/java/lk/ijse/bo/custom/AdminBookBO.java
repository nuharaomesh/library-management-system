package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBO;
import lk.ijse.dto.BookDTO;

public interface AdminBookBO extends SuperBO {
    boolean saveBook(BookDTO dto);
}
