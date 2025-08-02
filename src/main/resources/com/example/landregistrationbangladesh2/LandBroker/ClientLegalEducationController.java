package lawyer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ClientLegalEducationController {
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
        System.out.println("Organize Legal Awareness Session triggered.");
    }

    private void handleEvent2() {
        System.out.println("Prepare Informative Material triggered.");
    }

    private void handleEvent3() {
        System.out.println("Distribute Flyers triggered.");
    }

    private void handleEvent4() {
        System.out.println("Answer FAQs triggered.");
    }

    private void handleEvent5() {
        System.out.println("Update Clients on Legal Changes triggered.");
    }

}
