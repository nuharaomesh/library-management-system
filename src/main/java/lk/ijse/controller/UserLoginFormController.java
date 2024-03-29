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
import lk.ijse.bo.custom.UserLoginBo;

import java.io.IOException;

public class UserLoginFormController {

    @FXML
    public PasswordField txtPassword;
    @FXML
    public TextField txtEmail;
    @FXML
    public AnchorPane pane;
    private UserLoginBo userLoginBo = (UserLoginBo) BOFactory.getBOFactory().getTypes(BOFactory.BOTypes.USER_LOGIN);
    public static String userId;

    public void initialize() {
        userId = userLoginBo.getId(txtEmail.getText());
    }
    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) this.pane.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/user_main_form.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void btnSignInOnAction(ActionEvent event) throws IOException {
        this.pane.getChildren().clear();
        this.pane.getChildren().add(FXMLLoader.load(getClass().getResource("/view/user_signin_form.fxml")));
    }

    public void btnForgetPasswordOnAction(ActionEvent actionEvent) {
    }
}
