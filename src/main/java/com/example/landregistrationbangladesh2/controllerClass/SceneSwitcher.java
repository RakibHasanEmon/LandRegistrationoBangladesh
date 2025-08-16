package com.example.landregistrationbangladesh2.controllerClass;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitcher {

    public static void switchScene(ActionEvent event, String fxmlFile) {
        try {
            // Ensure proper path: starts with "/" and is relative to resources folder
            Parent root = FXMLLoader.load(SceneSwitcher.class.getResource(fxmlFile));

            // Get the stage from the event source
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Switch the scene
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error loading FXML file: " + fxmlFile);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.err.println("FXML file not found: " + fxmlFile);
        }
    }
}
