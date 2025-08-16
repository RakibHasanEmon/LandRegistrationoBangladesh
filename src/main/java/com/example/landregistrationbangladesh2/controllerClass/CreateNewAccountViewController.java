package com.example.landregistrationbangladesh2.controllerClass;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CreateNewAccountViewController
{
    @javafx.fxml.FXML
    private Label errorText;
    @javafx.fxml.FXML
    private TextField mobileTextfield;
    @javafx.fxml.FXML
    private TextField idTextfield;
    @javafx.fxml.FXML
    private TextField addressTextfield;
    @javafx.fxml.FXML
    private DatePicker dobDatepicker;
    @javafx.fxml.FXML
    private TextField nameTextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-clerk-view.fxml");
    }

    @javafx.fxml.FXML
    public void handelRegisterbutton(ActionEvent actionEvent) {
        errorText.setText("Account has created.");
    }
}