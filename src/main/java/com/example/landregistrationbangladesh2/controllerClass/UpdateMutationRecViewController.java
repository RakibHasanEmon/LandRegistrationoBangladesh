package com.example.landregistrationbangladesh2.controllerClass;

import com.example.landregistrationbangladesh2.modelClass.LandRegistration;
import com.example.landregistrationbangladesh2.modelClass.Mutation;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.time.LocalDate;

import static com.example.landregistrationbangladesh2.controllerClass.DataStore.landRegistrationArrayList;
import static com.example.landregistrationbangladesh2.controllerClass.DataStore.mutationArrayList;

public class UpdateMutationRecViewController
{
    @javafx.fxml.FXML
    private Text errorText;
    @javafx.fxml.FXML
    private TableColumn<Mutation, String> addressCol;
    @javafx.fxml.FXML
    private TextField savedId;
    @javafx.fxml.FXML
    private TableColumn<Mutation, Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<Mutation, LocalDate> dobCol;
    @javafx.fxml.FXML
    private TableColumn<Mutation, String> oldOwnCol;
    @javafx.fxml.FXML
    private TableColumn<Mutation, String> newOwnCol;
    @javafx.fxml.FXML
    private TableColumn<Mutation, Integer> mobileCol;
    @javafx.fxml.FXML
    private TableView<Mutation> mutationTableView;
    @javafx.fxml.FXML
    private TableColumn<Mutation, LocalDate> applicationDateCol;

    @javafx.fxml.FXML
    public void initialize() {
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        applicationDateCol.setCellValueFactory(new PropertyValueFactory<>("applicationDate"));
        dobCol.setCellValueFactory(new PropertyValueFactory<>("dob"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        mobileCol.setCellValueFactory(new PropertyValueFactory<>("mobile"));
        newOwnCol.setCellValueFactory(new PropertyValueFactory<>("nameN"));
        oldOwnCol.setCellValueFactory(new PropertyValueFactory<>("nameO"));

        mutationTableView.getItems().addAll(mutationArrayList);
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-clerk-view.fxml");
    }

    @javafx.fxml.FXML
    public void handleSaveButton(ActionEvent actionEvent) {
        Mutation mutation = null;
        for (Mutation m: mutationArrayList){
            if(Integer.parseInt(savedId.getText()) == m.getId()){
                mutation = m;
                break;
            }
        }

        for (LandRegistration lr: landRegistrationArrayList){
            if(Integer.parseInt(savedId.getText()) == lr.getId()){
                assert mutation != null;
                lr.setDob(mutation.getDob());
                lr.setPhoneNo(mutation.getMobile());
                lr.setAddress(mutation.getAddress());
                lr.setName(mutation.getNameN());
                lr.setApplicationDate(mutation.getApplicationDate());
                errorText.setText("Saved");
                return;
            }
        }
        errorText.setText("Invalid ID");
    }
}