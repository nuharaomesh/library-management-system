package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AdminDashboardFormController {

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colTRBookId;

    @FXML
    private TableColumn<?, ?> colTRBorrowDate;

    @FXML
    private TableColumn<?, ?> colTRName;

    @FXML
    private TableColumn<?, ?> colTRReturnDate;

    @FXML
    private TableColumn<?, ?> colTel;

    @FXML
    private TableColumn<?, ?> colUserID;

    @FXML
    private TableColumn<?, ?> colUsername;

    @FXML
    private Label lblBookCount;

    @FXML
    private Label lblBookTitle;

    @FXML
    private Label lblBorrowDate;

    @FXML
    private Label lblBranchName;

    @FXML
    private Label lblCategory;

    @FXML
    private Label lblReturnDate;

    @FXML
    private Label lblUserCount;

    @FXML
    private Label lblUserName;

    @FXML
    private TableView<?> tblUserTransaction;

    @FXML
    private TableView<?> tblUsers;

    public void initialize() {

    }

    @FXML
    void btnSearchUserOnAction(ActionEvent event) {

    }
}
