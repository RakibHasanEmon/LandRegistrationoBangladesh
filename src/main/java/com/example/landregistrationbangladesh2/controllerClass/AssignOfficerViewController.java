package com.example.landregistrationbangladesh2.controllerClass;

import com.example.landregistrationbangladesh2.modelClass.LandRegistration;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

import static com.example.landregistrationbangladesh2.controllerClass.DataStore.landRegistrationArrayList;

public class AssignOfficerViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> officerComboBox;
    @javafx.fxml.FXML
    private TableView<LandRegistration> pandingApplicationTableView;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, String> statusCol;
    @javafx.fxml.FXML
    private TextField searchId;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, LocalDate> applicationDateCol;
    @javafx.fxml.FXML
    private Label errorLabel;

    @javafx.fxml.FXML
    public void initialize() {
        applicationDateCol.setCellValueFactory(new PropertyValueFactory<>("applicationDate"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        officerComboBox.getItems().addAll("Arranya Mandol", "Saifil Islam", "Jubayer rasid");

        for (LandRegistration lr: landRegistrationArrayList){
            if (lr.getStatus().equals("Pending")){
                pandingApplicationTableView.getItems().add(lr);
            }
        }
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-clerk-view.fxml");
    }


    @javafx.fxml.FXML
    public void handleAssignButton(ActionEvent actionEvent) {
        errorLabel.setText("ID" + " " + searchId.getText() + " " + "sent to " + officerComboBox.getValue());

    }
}