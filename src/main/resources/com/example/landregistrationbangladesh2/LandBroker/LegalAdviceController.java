package lawyer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LegalAdviceController {
    @FXML
    private Button btnEvent1;
    @FXML
    private Button btnEvent2;
    @FXML
    private Button btnEvent3;
    @FXML
    private Button btnEvent4;

    @FXML
    public void initialize() {
        btnEvent1.setOnAction(e -> handleEvent1());
        btnEvent2.setOnAction(e -> handleEvent2());
        btnEvent3.setOnAction(e -> handleEvent3());
        btnEvent4.setOnAction(e -> handleEvent4());
    }

    private void handleEvent1() {
        System.out.println("Receive Client Query triggered.");
    }

    private void handleEvent2() {
        System.out.println("Review Documents & Case History triggered.");
    }

    private void handleEvent3() {
        System.out.println("Check Land Law Database triggered.");
    }

    private void handleEvent4() {
        System.out.println("Log Consultation in Record triggered.");
    }

}
