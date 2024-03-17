package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBO;
import lk.ijse.dto.AdminDTO;

public interface AdminLoginBO extends SuperBO {
    boolean checkCredential(AdminDTO dto);
}
