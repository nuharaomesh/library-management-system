package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import lk.ijse.bo.BOFactory;
import lk.ijse.bo.custom.AdminBookBO;
import lk.ijse.dto.BookDTO;

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
    private AdminBookBO adminBookBO = (AdminBookBO) BOFactory.getBOFactory().getTypes(BOFactory.BOTypes.ADMIN_BOOK);

    public void initialize() {
        setPaneVisibleFalse();
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

        BookDTO dto = null; /*= new BookDTO(txtBookTitle.getText(), String.valueOf(cmbCategory.getValue()), txtAuthorName.getText(), Integer.valueOf(txtBookQty.getText()));*/

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
