package com.example.landregistrationbangladesh2.controllerClass;

import com.example.landregistrationbangladesh2.modelClass.LandRegistration;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import static com.example.landregistrationbangladesh2.controllerClass.DataStore.landRegistrationArrayList;

public class ReviewNewApplicationViewController
{
    @javafx.fxml.FXML
    private TableView<LandRegistration> applicationTableView;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, String> addressCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, Integer> mobileCol;

    @javafx.fxml.FXML
    public void initialize() {
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        mobileCol.setCellValueFactory(new PropertyValueFactory<>("phoneNo"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        applicationTableView.getItems().addAll(landRegistrationArrayList);
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-clerk-view.fxml");
    }
}