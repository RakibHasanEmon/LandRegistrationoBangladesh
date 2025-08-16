package com.example.landregistrationbangladesh2.FieldSurveyor;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class RecordBoundaryMarkerController
{
    @javafx.fxml.FXML
    private TextField markerIdTF;
    @javafx.fxml.FXML
    private ComboBox<String> markerLocationCB;
    @javafx.fxml.FXML
    private DatePicker installationDateDP;
    @javafx.fxml.FXML
    private TextField markerTypeTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void refreshMapButtonOA(ActionEvent actionEvent) {
        System.out.println("refres Map Button");
    }

    @javafx.fxml.FXML
    public void recordMarkerOA(ActionEvent actionEvent) {
        System.out.println("record Marker");
    }

    @javafx.fxml.FXML
    public void addMarkerOA(ActionEvent actionEvent) {
        String markerId = markerIdTF.getText();
        String type = markerTypeTF.getText();
        String location = markerLocationCB.getValue();

        System.out.println("marker added:" + markerId + ","+type + ","+location);

    }

    @javafx.fxml.FXML
    public void uploadPhotoOA(ActionEvent actionEvent) {
        System.out.println("Upload photo clicked");
    }
}