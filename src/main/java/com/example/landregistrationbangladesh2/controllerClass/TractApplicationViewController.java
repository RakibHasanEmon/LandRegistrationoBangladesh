package com.example.landregistrationbangladesh2.controllerClass;

import com.example.landregistrationbangladesh2.modelClass.LandRegistration;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.time.LocalDate;

import static com.example.landregistrationbangladesh2.controllerClass.DataStore.landRegistrationArrayList;

public class TractApplicationViewController
{
    @javafx.fxml.FXML
    private TableView<LandRegistration> applicationTableView;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, String> addressCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, LocalDate> statusCol;
    @javafx.fxml.FXML
    private TextField searchId;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, LocalDate> dobCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, String> statusCol1;
    @javafx.fxml.FXML
    private Text errorTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        dobCol.setCellValueFactory(new PropertyValueFactory<>("dob"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("applicationDate"));
        statusCol1.setCellValueFactory(new PropertyValueFactory<>("status"));

        applicationTableView.getItems().addAll(landRegistrationArrayList);
    }

    @javafx.fxml.FXML
    public void handleSearchButton(ActionEvent actionEvent) {


        try {
            int id = Integer.parseInt(searchId.getText());

        } catch (Exception e){
            errorTextfield.setText("invalid ID");
            return;
        }


        for (LandRegistration lr : landRegistrationArrayList){
            if (Integer.parseInt(searchId.getText()) == lr.getId()){
                applicationTableView.getItems().clear();
                applicationTableView.getItems().add(lr);
                errorTextfield.setText("Found");
                return;
            }
        }
        errorTextfield.setText("Not Found");


    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-view.fxml");
    }

    @javafx.fxml.FXML
    public void hendelContactOfficer(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/contact-officer-view .fxml");
    }
}