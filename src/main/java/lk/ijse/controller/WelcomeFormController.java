package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class WelcomeFormController {

    @FXML
    public AnchorPane pane;

    @FXML
    void btnAdminOnAction(ActionEvent event) {

    }

    @FXML
    void btnUserOnAction(ActionEvent event) throws IOException {
        this.pane.getChildren().clear();
        this.pane.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/user_login_form.fxml")));
    }
}
