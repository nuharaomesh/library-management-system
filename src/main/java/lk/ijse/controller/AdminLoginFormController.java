package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AdminLoginFormController {

    @FXML
    public AnchorPane pane;
    @FXML
    private TextField txtEmail;
    @FXML
    private PasswordField txtPassword;

    @FXML
    void btnForgetPasswordOnAction(ActionEvent event) {

    }

    @FXML
    void btnLoginOnAction(ActionEvent event) {

    }

    @FXML
    void btnSignInOnAction(ActionEvent event) throws IOException {
        this.pane.getChildren().clear();
        this.pane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/admin_signin_form.fxml")));
    }

    @FXML
    void ckBoxShowPassword(ActionEvent event) {

    }
}
