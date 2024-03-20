package lk.ijse.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import lk.ijse.bo.BOFactory;
import lk.ijse.bo.custom.AdminBookBO;
import lk.ijse.dto.BookDTO;
import lk.ijse.dto.tm.AdminBookTM;
import lk.ijse.util.Validation;

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
    private TableColumn<?, ?> colStatus;
    @FXML
    private TableColumn<?, ?> colTel;
    @FXML
    private TableColumn<?, ?> colTitle;
    @FXML
    private Label lblBookTitle;
    @FXML
    private TableView<?> tblBookDetails;
    @FXML
    private TableView<AdminBookTM> tblBooks;
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
    private String EMAIL = AdminLoginFormController.ADMIN_EMAIL;
    private String adminBranchId;
    private Validation validation = Validation.getInstance();

    public void initialize() {
        setAdminBranchId(EMAIL);
        setCellValueFactory();
        loadAllBooks();
        setPaneVisibleFalse();
        setLanguageCmbValues();
        setCategoryCmbValues();
    }

    private void setAdminBranchId(String email) {
        adminBranchId = adminBookBO.getAdminBranchId(email);
    }

    private void setCellValueFactory() {
        colBookID.setCellValueFactory(new PropertyValueFactory<>("bookID"));
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colCategory.setCellValueFactory(new PropertyValueFactory<>("category"));
        colAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    public void loadAllBooks() {

        ObservableList<AdminBookTM> obList = FXCollections.observableArrayList();

        List<BookDTO> dtoList = adminBookBO.getAllBooks(adminBranchId);

        for (BookDTO dto: dtoList) {
            obList.add(
                    new AdminBookTM(
                            dto.getBookId(),
                            dto.getTitle(),
                            dto.getCategory(),
                            dto.getAuthor(),
                            "available"
                    )
            );
        }
        tblBooks.setItems(obList);
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

        String branch_id = adminBookBO.getId(EMAIL);
        BookDTO dto = new BookDTO(txtBookTitle.getText(), String.valueOf(cmbCategory.getValue()), txtAuthorName.getText(), String.valueOf(cmbLanguage.getValue()), branch_id);

        if (validation.getValidation("Book", dto)) {
            if (adminBookBO.saveBook(dto)) {
                new Alert(Alert.AlertType.CONFIRMATION, "Book Saved!!").showAndWait();
                paneBookAdd.setVisible(false);
            } else {
                new Alert(Alert.AlertType.ERROR, "Book didn't save").show();
            }
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

    private void setPaneVisibleFalse() {
        paneBookAdd.setVisible(false);
        paneBookUpdateForm.setVisible(false);
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
}
