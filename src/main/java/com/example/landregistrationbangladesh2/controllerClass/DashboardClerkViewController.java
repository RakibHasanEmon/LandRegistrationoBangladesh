package com.example.landregistrationbangladesh2.controllerClass;

import javafx.event.ActionEvent;

public class DashboardClerkViewController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleCustomerButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-view.fxml");
    }

    @javafx.fxml.FXML
    public void handleNewApplication(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/review-new-application-view.fxml");
    }

    @javafx.fxml.FXML
    public void handleVarifyApplication(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/verify-applications-view.fxml");
    }

    @javafx.fxml.FXML
    public void handleMutationRecord(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/update-mutation-rec-view.fxml");
    }

    @javafx.fxml.FXML
    public void handleNewAccount(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/create-new-account-view.fxml");
    }

    @javafx.fxml.FXML
    public void handlePendingRecord(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/assign-officer-view.fxml");
    }

    @javafx.fxml.FXML
    public void handlePamentRecord(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/make-payment-view.fxml");
    }
}