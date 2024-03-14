package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdminBranchFormController {

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colAuthor;

    @FXML
    private TableColumn<?, ?> colBookId;

    @FXML
    private TableColumn<?, ?> colBookTitle;

    @FXML
    private TableColumn<?, ?> colBranchId;

    @FXML
    private TableColumn<?, ?> colBranchName;

    @FXML
    private TableColumn<?, ?> colCount;

    @FXML
    private TableColumn<?, ?> colTel;

    @FXML
    private Label lblBranchName;

    @FXML
    private TableView<?> tblBookDetails;

    @FXML
    private TableView<?> tblBranches;

    @FXML
    private TextField txtBookTitleSearch;

    @FXML
    void btnBookSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnBranchAddOnAction(ActionEvent event) {

    }

    @FXML
    void btnCloseBranchOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }
}
