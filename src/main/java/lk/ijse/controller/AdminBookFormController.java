package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

public class AdminBookFormController {

    @FXML
    private ComboBox<?> cmbBranch;
    @FXML
    private ComboBox<?> cmbCategory;
    @FXML
    private ComboBox<?> cmbNewBranch;
    @FXML
    private ComboBox<?> cmbNewCategory;
    @FXML
    private TableColumn<?, ?> colAddress;
    @FXML
    private TableColumn<?, ?> colAuthor;
    @FXML
    private TableColumn<?, ?> colBookCount;
    @FXML
    private TableColumn<?, ?> colBookID;
    @FXML
    private TableColumn<?, ?> colBranchId;
    @FXML
    private TableColumn<?, ?> colBranchName;
    @FXML
    private TableColumn<?, ?> colCategory;
    @FXML
    private TableColumn<?, ?> colCount;
    @FXML
    private TableColumn<?, ?> colTel;
    @FXML
    private TableColumn<?, ?> colTitle;
    @FXML
    private Label lblBookTitle;
    @FXML
    private TableView<?> tblBookDetails;
    @FXML
    private TableView<?> tblBooks;
    @FXML
    private TextField txtBookTitleSearch;
    @FXML
    private Pane paneBookAdd;
    @FXML
    private TextField txtAuthorName;
    @FXML
    private TextField txtBookQty;
    @FXML
    private TextField txtBookTitle;
    @FXML
    private Pane paneBookUpdateForm;
    @FXML
    private TextField txtNewAuthorName;
    @FXML
    private TextField txtNewBookQty;
    @FXML
    private TextField txtNewBookTitle;

    @FXML
    void btnBookAddOnAction(ActionEvent event) {

    }

    @FXML
    void btnBookSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void btnBookUpdateBackOnAction(ActionEvent event) {

    }

    @FXML
    void btnBookUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void btnBookAddingOnAction(ActionEvent event) {

    }

    @FXML
    void btnBookAddingBackOnAction(ActionEvent event) {

    }
}
