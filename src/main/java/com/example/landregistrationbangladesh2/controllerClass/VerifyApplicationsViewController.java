package com.example.landregistrationbangladesh2.controllerClass;

import com.example.landregistrationbangladesh2.modelClass.LandRegistration;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.time.LocalDate;

import static com.example.landregistrationbangladesh2.controllerClass.DataStore.landRegistrationArrayList;

public class VerifyApplicationsViewController
{
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, String> locationCol;
    @javafx.fxml.FXML
    private Text errorText;
    @javafx.fxml.FXML
    private TableView<LandRegistration> applicationTableView;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, Integer> idCol;
    @javafx.fxml.FXML
    private TextField statusId;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, LocalDate> dobCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, LocalDate> applicationDateCol;
    @javafx.fxml.FXML
    private TextField searchIdTextField;

    @javafx.fxml.FXML
    public void initialize() {
        locationCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        applicationDateCol.setCellValueFactory(new PropertyValueFactory<>( "applicationDate"));
        dobCol.setCellValueFactory(new PropertyValueFactory<>("dob"));

        statusComboBox.getItems().addAll("Approved", "Pending", "Rejected");

    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-clerk-view.fxml");
    }

    @javafx.fxml.FXML
    public void handleSaveButton(ActionEvent actionEvent) {
        for (LandRegistration lr: landRegistrationArrayList){
            if(Integer.parseInt(statusId.getText()) == lr.getId()){
                lr.setStatus(statusComboBox.getValue());
                errorText.setText("Saved");
                return;
            }
        }
        errorText.setText("Invalid ID!");
    }

    @javafx.fxml.FXML
    public void handleSearchButton(ActionEvent actionEvent) {
        applicationTableView.getItems().clear();
        for (LandRegistration lr: landRegistrationArrayList){
            if (Integer.parseInt(searchIdTextField.getText()) == lr.getId()){
                applicationTableView.getItems().add(lr);
                return;
            }
        }
        errorText.setText("Invalid ID!");
    }
}