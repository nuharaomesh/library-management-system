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

public class AdminSignInFormController {

    @FXML
    public AnchorPane pane;
    @FXML
    private TextField txtAddress;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private PasswordField txtRepeatPassword;
    @FXML
    private TextField txtUserName;

    @FXML
    void btnCreateAccount(ActionEvent event) throws IOException {
        Stage stage = (Stage) this.pane.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/user_main_form.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void ckBoxShowPassword(ActionEvent event) {

    }
}
