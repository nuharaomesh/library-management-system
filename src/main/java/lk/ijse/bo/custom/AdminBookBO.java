package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBO;
import lk.ijse.dto.BookDTO;

import java.util.List;

public interface AdminBookBO extends SuperBO {
    boolean saveBook(BookDTO dto);
    String getId(String EMAIL);
    List<BookDTO> getAllBooks(String branchId);
    String getAdminBranchId(String email);
}
