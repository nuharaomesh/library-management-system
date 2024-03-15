package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.bo.BOFactory;
import lk.ijse.bo.custom.UserSignInBo;
import lk.ijse.dto.UserDTO;

import java.io.IOException;

public class UserSignInFormController {

    @FXML
    public AnchorPane pane;
    @FXML
    public TextField txtFirstName;
    @FXML
    public TextField txtEmail;
    @FXML
    public TextField txtLastName;
    @FXML
    public TextField txtUsername;
    @FXML
    public PasswordField txtPassword;
    @FXML
    public PasswordField txtRepeatPassword;
    private UserSignInBo userSignInBo = (UserSignInBo) BOFactory.getBOFactory().getTypes(BOFactory.BOTypes.USER_SIGN_IN);
    @FXML
    void btnSingInOnAction(ActionEvent event) throws IOException {

        UserDTO dto = new UserDTO(txtFirstName.getText(), txtLastName.getText(), txtUsername.getText(), txtEmail.getText(), txtPassword.getText());

        if (userSignInBo.saveUser(dto)) {

            Stage stage = (Stage) this.pane.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/user_main_form.fxml"))));
            stage.centerOnScreen();
            stage.show();
        }
    }
}
