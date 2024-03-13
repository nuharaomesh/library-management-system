package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class UserMainFormController {

    @FXML
    private ComboBox<?> cmbCategory;

    @FXML
    private TableColumn<?, ?> colAuhtor;

    @FXML
    private TableColumn<?, ?> colBookId;

    @FXML
    private TableColumn<?, ?> colDueDate;

    @FXML
    private TableColumn<?, ?> colGenre;

    @FXML
    private TableColumn<?, ?> colLanguage;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TableColumn<?, ?> colTRBookId;

    @FXML
    private TableColumn<?, ?> colTRBorrowedDate;

    @FXML
    private TableColumn<?, ?> colTRBranch;

    @FXML
    private TableColumn<?, ?> colTRCategory;

    @FXML
    private TableColumn<?, ?> colTRReturnedDate;

    @FXML
    private TableColumn<?, ?> colTRTitle;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private Label lblBookTitle;

    @FXML
    private Label lblBorrowedBkTitle;

    @FXML
    private Label lblBorrowedDate;

    @FXML
    private Label lblBranchName;

    @FXML
    private Label lblCategory;

    @FXML
    private Label lblDueDate;

    @FXML
    private Label lblUsername;

    @FXML
    private TableView<?> tableOnReading;

    @FXML
    private TableView<?> tblBook;

    @FXML
    private TableView<?> tblTransaction;

    @FXML
    private TextField txtSearchProperty;

    @FXML
    void btnBorrowBookOnAction(ActionEvent event) {

    }

    @FXML
    void btnReturnBookOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchBookOnAction(ActionEvent event) {

    }

    @FXML
    void cmbCategoryOnAction(ActionEvent event) {

    }
}
