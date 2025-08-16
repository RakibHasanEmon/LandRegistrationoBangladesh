package com.example.landregistrationbangladesh2.controllerClass;

import com.example.landregistrationbangladesh2.modelClass.Payment;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import static com.example.landregistrationbangladesh2.controllerClass.DataStore.paymentArrayList;

public class RegistrationFeeViewController
{
    @javafx.fxml.FXML
    private Text errorText;
    @javafx.fxml.FXML
    private TextField regFee;
    @javafx.fxml.FXML
    private TextField idTextfield;
    @javafx.fxml.FXML
    private DatePicker dobDatepicker;
    @javafx.fxml.FXML
    private TextField name;
    @javafx.fxml.FXML
    private TextField mobile;
    @javafx.fxml.FXML
    private ComboBox<String> paymentMethodComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        paymentMethodComboBox.getItems().addAll("Bkash", "Nagad", "Cash");
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-view.fxml");
    }

    @javafx.fxml.FXML
    public void handleConfirmButton(ActionEvent actionEvent) {
        Payment p = new Payment(
                Integer.parseInt(idTextfield.getText()),
                Float.parseFloat(regFee.getText()),
                name.getText(),
                Integer.parseInt(mobile.getText()),
                dobDatepicker.getValue(),
                paymentMethodComboBox.getValue()
        );

        paymentArrayList.add(p);
        errorText.setText("Added Successfully");
    }
}