package lk.ijse.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import lk.ijse.bo.BOFactory;
import lk.ijse.bo.custom.AdminBookBO;
import lk.ijse.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class AdminBookFormController {

    @FXML
    private ComboBox<String> cmbCategory;
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
    private ComboBox<?> cmbNewLanguage;
    @FXML
    private ComboBox<String> cmbLanguage;
    @FXML
    private TextField txtBookTitle;
    @FXML
    private Pane paneBookUpdateForm;
    @FXML
    private TextField txtNewAuthorName;
    @FXML
    private TextField txtNewBookTitle;
    private AdminBookBO adminBookBO = (AdminBookBO) BOFactory.getBOFactory().getTypes(BOFactory.BOTypes.ADMIN_BOOK);

    public void initialize() {
        setPaneVisibleFalse();
        setLanguageCmbValues();
        setCategoryCmbValues();
    }

    private void setCategoryCmbValues() {

        ObservableList<String> obList = FXCollections.observableArrayList();
        obList.add("Horror");
        obList.add("Story");
        obList.add("Research");
        obList.add("Fantasy");
        obList.add("Novel");

        cmbCategory.setItems(obList);
    }

    private void setLanguageCmbValues() {

        ObservableList<String> obList = FXCollections.observableArrayList();
        obList.add("English");
        obList.add("Tamil");
        obList.add("Sinhalese");

        cmbLanguage.setItems(obList);
    }

    private void setPaneVisibleFalse() {
        paneBookAdd.setVisible(false);
        paneBookUpdateForm.setVisible(false);
    }

    @FXML
    void btnBookSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnBookUpdateOnAction(ActionEvent event) {
        //update books
    }

    @FXML
    void btnBookAddingOnAction(ActionEvent event) {     //save book

        BookDTO dto = new BookDTO(txtBookTitle.getText(), String.valueOf(cmbCategory.getValue()), txtAuthorName.getText(), String.valueOf(cmbLanguage.getValue()));

        if (adminBookBO.saveBook(dto)) {

            new Alert(Alert.AlertType.CONFIRMATION, "Book Saved!!").show();
        } else {
            new Alert(Alert.AlertType.ERROR, "Book didn't save").show();
        }
    }

    @FXML
    void btnBookAddOnAction(ActionEvent event) {
        paneBookAdd.setVisible(true);
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        paneBookUpdateForm.setVisible(true);
    }

    @FXML
    void btnBookUpdateBackOnAction(ActionEvent event) {
        paneBookUpdateForm.setVisible(false);
    }

    @FXML
    void btnBookAddingBackOnAction(ActionEvent event) {
        paneBookAdd.setVisible(false);
    }
}
