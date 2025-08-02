package lawyer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LegalCaseManagementController {
    @FXML
    private Button btnEvent1;
    @FXML
    private Button btnEvent2;
    @FXML
    private Button btnEvent3;
    @FXML
    private Button btnEvent4;
    @FXML
    private Button btnEvent5;

    @FXML
    public void initialize() {
        btnEvent1.setOnAction(e -> handleEvent1());
        btnEvent2.setOnAction(e -> handleEvent2());
        btnEvent3.setOnAction(e -> handleEvent3());
        btnEvent4.setOnAction(e -> handleEvent4());
        btnEvent5.setOnAction(e -> handleEvent5());
    }

    private void handleEvent1() {
        System.out.println("Log Active Cases triggered.");
    }

    private void handleEvent2() {
        System.out.println("Tag Cases with Deadlines triggered.");
    }

    private void handleEvent3() {
        System.out.println("Receive Court Alerts triggered.");
    }

    private void handleEvent4() {
        System.out.println("Update Case Status triggered.");
    }

    private void handleEvent5() {
        System.out.println("Archive Resolved Cases triggered.");
    }

}
