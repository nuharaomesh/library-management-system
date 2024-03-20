package lk.ijse.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lk.ijse.bo.BOFactory;
import lk.ijse.bo.custom.UserDashboardBO;
import lk.ijse.dto.BookDTO;
import lk.ijse.dto.TransactionDTO;
import lk.ijse.dto.tm.UsersBookTM;
import lk.ijse.entity.Transaction;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class UserMainFormController {

    @FXML
    public Pane userSettingPane;
    @FXML
    public AnchorPane root;
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
    private Label lblLanguage;
    @FXML
    private Label lblUsername;
    @FXML
    private TableView<?> tableOnReading;
    @FXML
    private TableView<UsersBookTM> tblBook;
    @FXML
    private TableView<?> tblTransaction;
    @FXML
    private TextField txtSearchProperty;
    private UserDashboardBO userDashboardBO = (UserDashboardBO) BOFactory.getBOFactory().getTypes(BOFactory.BOTypes.USER_DASHBOARD);
    private String bookId;
    private String userId = UserLoginFormController.userId;

    public void initialize() {
        this.userSettingPane.setVisible(false);
        setCellValueFactory();
        loadAllBooks();
        tableListener();
    }

    private void setCellValueFactory() {
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
        colGenre.setCellValueFactory(new PropertyValueFactory<>("category"));
        colLanguage.setCellValueFactory(new PropertyValueFactory<>("language"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    private void loadAllBooks() {
        ObservableList<UsersBookTM> obList = FXCollections.observableArrayList();

        List<BookDTO> dtoList = userDashboardBO.getAllBooks();
        for (BookDTO dto: dtoList) {
            obList.add(
                    new UsersBookTM(
                            dto.getBookId(),
                            dto.getTitle(),
                            dto.getCategory(),
                            dto.getAuthor(),
                            "available"
                    )
            );
        }
        tblBook.setItems(obList);
    }

    private void tableListener() {
        tblBook.getSelectionModel().selectedItemProperty().addListener((observable, oldValued, newValue) -> {

            BookDTO dto = userDashboardBO.searchBook(newValue.getTitle());
            setData(newValue.getTitle(), dto.getLanguage(), dto.getCategory(), dto.getBookId());
        });
    }

    void setData(String title, String language, String category, String bookId) {
        lblBookTitle.setText(title);
        lblLanguage.setText(language);
        lblCategory.setText(category);
        this.bookId = bookId;
    }



    public Date addDays(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }

    @FXML
    void btnBorrowBookOnAction(ActionEvent event) throws ParseException {
        String borrowDate = String.valueOf(LocalDate.now());
        String sourceDate = "2024-03-11";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = format.parse(sourceDate);
        myDate = addDays(myDate, 7);

//        UserDashboardBO;

        if (!lblBookTitle.getText().equals("")) {
            TransactionDTO dto = new TransactionDTO(borrowDate, String.valueOf(myDate), "reading", bookId, userId);

            userDashboardBO.saveTransaction(dto);

        } else {
            new Alert(Alert.AlertType.ERROR, "select a Book first!!").showAndWait();
        }
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
    void btnLogoutOnAction(ActionEvent event) throws IOException {
        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/start_form.fxml"))));
        stage.centerOnScreen();
    }

    @FXML
    void btnUserSettingBackOnAction(ActionEvent event) {
        this.userSettingPane.setVisible(false);
    }
}
