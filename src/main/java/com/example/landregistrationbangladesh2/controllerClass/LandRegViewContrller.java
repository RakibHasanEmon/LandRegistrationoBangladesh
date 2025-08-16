package com.example.landregistrationbangladesh2.controllerClass;

import com.example.landregistrationbangladesh2.modelClass.LandRegistration;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import static com.example.landregistrationbangladesh2.controllerClass.DataStore.landRegistrationArrayList;

public class LandRegViewContrller
{
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
    private Text errorMsgLabel;
    @javafx.fxml.FXML
    private TextField measureTextField;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private DatePicker applicationDate;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handelRegisterbutton(ActionEvent actionEvent) {
        try {
            int id = Integer.parseInt(idTextfield.getText());

        } catch (Exception e){
            errorMsgLabel.setText("invalid id");
            return;
        }

        LandRegistration lr = new LandRegistration(
                Integer.parseInt(idTextfield.getText()),
                nameTextfield.getText(),
                addressTextfield.getText(),
                Integer.parseInt(mobileTextfield.getText()),
                dobDatepicker.getValue(),
                locationTextField.getText(),
                Integer.parseInt(measureTextField.getText()),
                applicationDate.getValue()
        );

        landRegistrationArrayList.add(lr);

        errorMsgLabel.setText("Application Added Successfully.");

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-view.fxml");
    }
}