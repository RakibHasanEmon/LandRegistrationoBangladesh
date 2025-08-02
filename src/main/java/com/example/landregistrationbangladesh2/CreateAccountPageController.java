package com.example.landregistrationbangladesh2;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class CreateAccountPageController
{
    @javafx.fxml.FXML
    private TextArea outputTA;
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private TextArea addressTA;
    @javafx.fxml.FXML
    private RadioButton othersRB;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private RadioButton maleRB;
    @javafx.fxml.FXML
    private PasswordField passwordPF;
    @javafx.fxml.FXML
    private DatePicker dobDP;
    @javafx.fxml.FXML
    private RadioButton femaleRB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createAccountOA(ActionEvent actionEvent) {

        String name,email,phone,gender="",address,password;
        LocalDate dob;


        name = nameTF.getText();
        email = emailTF.getText();
        phone = phoneTF.getText();
        address = addressTA.getText();
        password = passwordPF.getText();
        dob = dobDP.getValue();

        if(maleRB.isSelected()){
            gender = "Male";
        }
        if(femaleRB.isSelected()){
            gender = "Female";
        }
        if(othersRB.isSelected()){
            gender = "Others";

        }



        outputTA.clear();





    }
}