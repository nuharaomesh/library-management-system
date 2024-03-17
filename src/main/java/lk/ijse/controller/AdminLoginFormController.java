package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.bo.BOFactory;
import lk.ijse.bo.custom.AdminLoginBO;
import lk.ijse.dto.AdminDTO;
import lk.ijse.entity.Admin;

import java.io.IOException;

public class AdminLoginFormController {

    @FXML
    public AnchorPane pane;
    @FXML
    private TextField txtEmail;
    @FXML
    private PasswordField txtPassword;
    private AdminLoginBO adminLoginBO = (AdminLoginBO) BOFactory.getBOFactory().getTypes(BOFactory.BOTypes.ADMIN_LOGIN);

    @FXML
    void btnForgetPasswordOnAction(ActionEvent event) {

    }

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {

        var admin = new AdminDTO(txtEmail.getText(), txtPassword.getText());

        if (adminLoginBO.checkCredential(admin)) {
            Stage stage = (Stage) this.pane.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/admin_main_form.fxml"))));
            stage.centerOnScreen();
            stage.show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Wrong password or email!!!").show();
        }
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
