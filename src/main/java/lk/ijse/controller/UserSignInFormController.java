package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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

    @FXML
    void btnSingInOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) this.pane.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/user_main_form.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }
}
