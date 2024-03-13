package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

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
    void btnSingInOnAction(ActionEvent event) {

    }
}
