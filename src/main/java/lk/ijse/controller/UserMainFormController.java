package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

public class UserMainFormController {

    @FXML
    public Pane userSettingPane;
    @FXML
    private ComboBox<?> cmbCategory;
    @FXML
    private TableColumn<?, ?> colAuthor;
    @FXML
    private TableColumn<?, ?> colBookId;
    @FXML
    private TableColumn<?, ?> colOnReadingBKTitle;
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

    public void initialize() {
        this.userSettingPane.setVisible(false);
    }

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

    @FXML
    public void btnEditProfileOnAction(ActionEvent actionEvent) {

    }

    @FXML
    public void btnChangePasswordOnAction(ActionEvent actionEvent) {

    }

    @FXML
    public void btnSDeleteAccountOnAction(ActionEvent actionEvent) {

    }

    @FXML
    public void btnUserAccountMngOnAction(ActionEvent actionEvent) {
        this.userSettingPane.setVisible(true);
    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {

    }

    @FXML
    void btnUserSettingBackOnAction(ActionEvent event) {

        this.userSettingPane.setVisible(false);
    }
}
