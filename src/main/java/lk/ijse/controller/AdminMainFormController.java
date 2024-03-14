package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AdminMainFormController {

    @FXML
    private Label lblAdminName;
    @FXML
    private AnchorPane pane;
    @FXML
    private ImageView imgBook;
    @FXML
    private ImageView imgBranch;
    @FXML
    private ImageView imgDashboard;
    @FXML
    private Button btnBook;
    @FXML
    private Button btnBranch;
    @FXML
    private Button btnDashboard;
    @FXML
    private Label lblDate;

    public void initialize() throws IOException {

    }

    @FXML
    void btnDashBoardOnAction(ActionEvent event) {

    }

    @FXML
    void btnBookOnAction(ActionEvent event) {

    }

    @FXML
    void btnBranchOnAction(ActionEvent event) {

    }

    @FXML
    void btnAdminAccountMng(ActionEvent event) {

    }

    @FXML
    void btnDashboardMP(MouseEvent event) {
        btnDashboard.setStyle("-fx-background-color:  #7E00BE");
        imgDashboard.setImage(new Image("/assets/logo/dashboard white.png"));
        btnBook.setStyle("-fx-background-color: white");
        imgBook.setImage(new Image("/assets/logo/book purple.png"));
        btnBranch.setStyle("-fx-background-color: white");
        imgBranch.setImage(new Image("/assets/logo/branch purple.png"));
    }

    @FXML
    void btnBookMP(MouseEvent event) {
        btnDashboard.setStyle("-fx-background-color:  white");
        imgDashboard.setImage(new Image("/assets/logo/dashboard purple.png"));
        btnBook.setStyle("-fx-background-color: #7E00BE");
        imgBook.setImage(new Image("/assets/logo/book white.png"));
        btnBranch.setStyle("-fx-background-color: white");
        imgBranch.setImage(new Image("/assets/logo/branch purple.png"));
    }

    @FXML
    void btnBranchMP(MouseEvent event) {
        btnDashboard.setStyle("-fx-background-color:  white");
        imgDashboard.setImage(new Image("/assets/logo/dashboard purple.png"));
        btnBook.setStyle("-fx-background-color: white");
        imgBook.setImage(new Image("/assets/logo/book purple.png"));
        btnBranch.setStyle("-fx-background-color: #7E00BE");
        imgBranch.setImage(new Image("/assets/logo/branch white.png"));
    }
}
