package com.example.landregistrationbangladesh2.controllerClass;

import javafx.event.ActionEvent;

public class DashboardViewController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void trackApplicationHandle(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/tract-application-view.fxml");
    }

    @javafx.fxml.FXML
    public void landRegHandle(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/land-reg-view.fxml");
    }

    @javafx.fxml.FXML
    public void handleUpdateProfile(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/update-info-view.fxml");
    }

    @javafx.fxml.FXML
    public void handleSurvayReport(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/servey-report-view.fxml");
    }

    @javafx.fxml.FXML
    public void handlePayRegFee(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/registration-fee-view.fxml");
    }

    @javafx.fxml.FXML
    public void handleMutation(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/mutation-application-view.fxml");
    }

    @javafx.fxml.FXML
    public void handleClarkButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/example/landregistrationbangladesh2/dashboard-clerk-view.fxml");
    }
}