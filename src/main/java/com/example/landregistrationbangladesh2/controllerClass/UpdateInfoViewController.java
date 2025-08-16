package com.example.landregistrationbangladesh2.controllerClass;

import com.example.landregistrationbangladesh2.modelClass.LandRegistration;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import static com.example.landregistrationbangladesh2.controllerClass.DataStore.landRegistrationArrayList;

public class UpdateInfoViewController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField addressN;
    @javafx.fxml.FXML
    private Text errorText;
    @javafx.fxml.FXML
    private DatePicker dobN;
    @javafx.fxml.FXML
    private TextField mobileN;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-view.fxml");
    }

    @javafx.fxml.FXML
    public void handleSaveButton(ActionEvent actionEvent) {
        for (LandRegistration lr: landRegistrationArrayList){
            if (Integer.parseInt(idTextField.getText()) == lr.getId()){
                lr.setAddress(addressN.getText());
                lr.setPhoneNo(Integer.parseInt(mobileN.getText()));
                lr.setDob(dobN.getValue());
                errorText.setText("Changed successful");
                return;
            }
        }
        errorText.setText("Invalid ID");
    }
}