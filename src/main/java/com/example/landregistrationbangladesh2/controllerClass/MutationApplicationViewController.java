package com.example.landregistrationbangladesh2.controllerClass;

import com.example.landregistrationbangladesh2.modelClass.Mutation;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import static com.example.landregistrationbangladesh2.controllerClass.DataStore.mutationArrayList;

public class MutationApplicationViewController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField houseAddressN;
    @javafx.fxml.FXML
    private TextField nameTextfieldP;
    @javafx.fxml.FXML
    private Text errorText;
    @javafx.fxml.FXML
    private TextField nameTextfieldN;
    @javafx.fxml.FXML
    private DatePicker dobDatepickerN;
    @javafx.fxml.FXML
    private DatePicker applicaitonDateN;
    @javafx.fxml.FXML
    private TextField mobileTextfieldN;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-view.fxml");
    }

    @javafx.fxml.FXML
    public void handelRegisterbutton(ActionEvent actionEvent) {
        Mutation m = new Mutation(
                Integer.parseInt(idTextField.getText()),
                nameTextfieldP.getText(),
                nameTextfieldN.getText(),
                houseAddressN.getText(),
                Integer.parseInt(mobileTextfieldN.getText()),
                dobDatepickerN.getValue(),
                applicaitonDateN.getValue()
        );

        mutationArrayList.add(m);
        errorText.setText("Added Successfully");
        System.out.println(mutationArrayList);
    }

    @javafx.fxml.FXML
    public void handelContactbutton(ActionEvent actionEvent) {
        

    }
}