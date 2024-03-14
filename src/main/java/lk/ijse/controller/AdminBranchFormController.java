package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

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

    //Branch add form properties
    @FXML
    private Pane paneAddBranchesForm;
    @FXML
    private TextField txtAddress;
    @FXML
    private TextField txtBranchName;
    @FXML
    private TextField txtTel;

    //Branch update form properties
    @FXML
    private Pane paneUpdateBranchesForm;
    @FXML
    private TextField txtNewAddress;
    @FXML
    private TextField txtNewBranchName;
    @FXML
    private TextField txtNewTel;

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

    //Add new Branch Form

    @FXML
    void btnAddBranchBackOnAction(ActionEvent event) {

    }

    @FXML
    void btnAddingNewBranchOnAction(ActionEvent event) {

    }

    //Update Branch Form

    @FXML
    void btnUpdateBranchBackOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateBranchesOnAction(ActionEvent event) {

    }
}
