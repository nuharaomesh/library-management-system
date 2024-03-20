package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lk.ijse.bo.BOFactory;
import lk.ijse.bo.custom.AdminBranchBO;
import lk.ijse.bo.custom.AdminSignInBO;
import lk.ijse.dto.AdminDTO;
import lk.ijse.dto.BranchDTO;

import java.io.IOException;
import java.sql.SQLException;

public class AdminSignInFormController {

    @FXML
    public AnchorPane pane;
    @FXML
    public TextField txtTel;
    @FXML
    public TextField txtBranchAddress;
    @FXML
    public TextField txtBranchName;
    @FXML
    private TextField txtAddress;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private PasswordField txtRepeatPassword;
    @FXML
    private TextField txtUserName;
    private AdminSignInBO adminSignInBO = (AdminSignInBO) BOFactory.getBOFactory().getTypes(BOFactory.BOTypes.ADMIN_SIGN_IN);
    private AdminBranchBO adminBranchBO = (AdminBranchBO) BOFactory.getBOFactory().getTypes(BOFactory.BOTypes.ADMIN_BRANCH);

    @FXML
    void btnCreateAccount(ActionEvent event) throws IOException, SQLException {

        String branchId = adminBranchBO.genId();

        BranchDTO branchDto = new BranchDTO(branchId, txtBranchName.getText(), txtBranchAddress.getText(), Integer.valueOf(txtTel.getText()));
        AdminDTO dto = new AdminDTO(txtFirstName.getText(), txtLastName.getText(), txtAddress.getText(), txtUserName.getText(), txtEmail.getText(), txtPassword.getText(), branchId);

        if (adminBranchBO.saveBranch(branchDto)) {
            if (adminSignInBO.saveAdmin(dto)) {
                Stage stage = (Stage) this.pane.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/admin_main_form.fxml"))));
                stage.centerOnScreen();
                stage.show();
            }
        }
    }
    @FXML
    void ckBoxShowPassword(ActionEvent event) {

    }
}
