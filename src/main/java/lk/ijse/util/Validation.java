package lk.ijse.util;

import javafx.scene.control.Alert;
import lk.ijse.dto.AdminDTO;
import lk.ijse.dto.BookDTO;
import lk.ijse.dto.UserDTO;

import java.util.regex.Pattern;

public class Validation {

    private static Validation validation;

    private Validation() {

    }

    public static Validation getInstance() {
        return (validation == null) ? new Validation() : validation;
    }

    public boolean getValidation(String type, Object dto) {

        if (type.equals("Admin")) {

            AdminDTO adminDTO = (AdminDTO) dto;
            if (!Pattern.matches("([A-Za-z])+\\b", adminDTO.getFirstName())) {
                new Alert(Alert.AlertType.ERROR, "Invalid First name!!").show();
                return false;
            }

            if (!Pattern.matches("([A-Za-z])+\\b", adminDTO.getLastName())) {
                new Alert(Alert.AlertType.ERROR, "Invalid Last name!!").show();
                return false;
            }

            if (!Pattern.matches("([A-z]+.gmail[.]com)", adminDTO.getEmail())) {
                new Alert(Alert.AlertType.ERROR, "Invalid Email!!").show();
                return false;
            }

            if (!Pattern.matches("([A-Za-z])+\\w", adminDTO.getAddress())) {
                new Alert(Alert.AlertType.ERROR, "Invalid Address!!").show();
                return false;
            }
            return true;
        } else if (type.equals("Book")) {

            BookDTO bookDTO = (BookDTO) dto;

            if (!Pattern.matches("([A-Za-z])+\\b", bookDTO.getTitle())) {
                new Alert(Alert.AlertType.ERROR, "Invalid title!!").show();
                return false;
            }

            if (!Pattern.matches("([A-Za-z])+\\b", bookDTO.getAuthor())) {
                new Alert(Alert.AlertType.ERROR, "Invalid author name!!").show();
                return false;
            }
            return true;
        } else if (type.equals("User")) {

            UserDTO userDTO = (UserDTO) dto;

            if (!Pattern.matches("([A-Za-z])+\\b", userDTO.getFirst_name())) {
                new Alert(Alert.AlertType.ERROR, "Invalid First name!!").show();
                return false;
            }

            if (!Pattern.matches("([A-Za-z])+\\b", userDTO.getLast_name())) {
                new Alert(Alert.AlertType.ERROR, "Invalid Last name!!").show();
                return false;
            }

            if (!Pattern.matches("([A-z]+.gmail[.]com)", userDTO.getEmail())) {
                new Alert(Alert.AlertType.ERROR, "Invalid Address!!").show();
                return false;
            }
            return true;
        } else {
            new Alert(Alert.AlertType.ERROR, "Not found " + type + " type!!").show();
        }
        new Alert(Alert.AlertType.ERROR, "Not valid!!!").show();
        return false;
    }
}
