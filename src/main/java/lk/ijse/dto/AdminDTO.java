package lk.ijse.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdminDTO {
    private String firstName;
    private String lastName;
    private String address;
    private String username;
    private String email;
    private String password;
    private String branchId;

    public AdminDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
