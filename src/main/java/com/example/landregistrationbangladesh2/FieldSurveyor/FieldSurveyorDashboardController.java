package com.example.landregistrationbangladesh2.FieldSurveyor;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.EventObject;

public class FieldSurveyorDashboardController
{
    @javafx.fxml.FXML
    private BorderPane fieldServeyorDashboardBP;
    @javafx.fxml.FXML
    private TextArea infoTA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateSurveyOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void scheduleSurveyOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void publicHearingOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordBoundaryMarker(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordLandUseOA(ActionEvent actionEvent) {
        System.out.println("record land use");
        EventObject event;
    }

    @javafx.fxml.FXML
    public void verifyLandBoundariesOA(ActionEvent actionEvent) {
        System .out.println("verify boundaries clicked");
    }

    @javafx.fxml.FXML
    public void collectGPSDataOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void submitSurveyReportOA(ActionEvent actionEvent) {

        System.out.println("submit survey report");
    }
}