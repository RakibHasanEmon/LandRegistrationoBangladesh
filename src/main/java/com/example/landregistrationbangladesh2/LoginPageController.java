package com.example.landregistrationbangladesh2;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPageController
{
    @javafx.fxml.FXML
    private TextField userIdTF;
    @javafx.fxml.FXML
    private PasswordField passwordPF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createNewAccountOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loginOA(ActionEvent actionEvent) {
        System.out.println("Login Page");
        String id,password;
        boolean flag = true;

        Alert alert = new Alert(Alert.AlertType.ERROR);

        id = userIdTF.getText();
        password = passwordPF.getText();

        if(id.isBlank()){
            flag = false;
            alert.setTitle("User id Error");
            alert.setContentText("User id cannot be blank");
            alert.showAndWait();

        }
        if(password.isBlank()){
            flag = false;
            alert.setTitle("Password Error");
            alert.setContentText("Password cannot be Blank");
            alert.showAndWait();


        }


    }
}