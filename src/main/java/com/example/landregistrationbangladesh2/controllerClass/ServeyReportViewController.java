package com.example.landregistrationbangladesh2.controllerClass;

import com.example.landregistrationbangladesh2.modelClass.LandRegistration;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import static com.example.landregistrationbangladesh2.controllerClass.DataStore.landRegistrationArrayList;

public class ServeyReportViewController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, String> presentOwnerCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, String> addressCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, String> statusCol;
    @javafx.fxml.FXML
    private TableView<LandRegistration> survvayTableView;
    @javafx.fxml.FXML
    private TableColumn<LandRegistration, Integer> plotSizeCol;
    @javafx.fxml.FXML
    private Text errorTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        plotSizeCol.setCellValueFactory(new PropertyValueFactory<>("measure"));
        presentOwnerCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        survvayTableView.getItems().addAll(landRegistrationArrayList);
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-view.fxml");
    }

    @javafx.fxml.FXML
    public void handleSearchButton(ActionEvent actionEvent) {
        for (LandRegistration lr : landRegistrationArrayList){
            if (Integer.parseInt(idTextField.getText()) == lr.getId()){
                survvayTableView.getItems().clear();
                survvayTableView.getItems().add(lr);
                return;

            }
        }
        errorTextfield.setText("Invalid ID");
    }
}