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
    private TextField txtLastName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private PasswordField txtRepeatPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnSingInOnAction(ActionEvent event) {

    }
}
