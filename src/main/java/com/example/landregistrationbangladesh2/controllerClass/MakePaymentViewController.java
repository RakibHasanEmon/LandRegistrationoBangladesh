package com.example.landregistrationbangladesh2.controllerClass;

import com.example.landregistrationbangladesh2.modelClass.Payment;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.time.LocalDate;

import static com.example.landregistrationbangladesh2.controllerClass.DataStore.paymentArrayList;

public class MakePaymentViewController
{
    @javafx.fxml.FXML
    private TableColumn<Payment, Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<Payment, Float> amountCol;
    @javafx.fxml.FXML
    private TableColumn<Payment, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TextField searchId;
    @javafx.fxml.FXML
    private TableColumn<Payment, String> nameCol;
    @javafx.fxml.FXML
    private TableView<Payment> paymentTableView;
    @javafx.fxml.FXML
    private Text errorText;

    @javafx.fxml.FXML
    public void initialize() {
        amountCol.setCellValueFactory(new PropertyValueFactory<>("regFee"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("paymentDate"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("applicationId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        paymentTableView.getItems().addAll(paymentArrayList);
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-clerk-view.fxml");
    }

    @javafx.fxml.FXML
    public void handlePaidButton(ActionEvent actionEvent) {
        errorText.setText("ID " + searchId.getText() + " registration fee is paid");
    }
}