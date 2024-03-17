package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBO;
import lk.ijse.dto.AdminDTO;

public interface AdminSignInBO extends SuperBO {
    boolean saveAdmin(AdminDTO dto);
}
