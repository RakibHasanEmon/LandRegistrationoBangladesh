module com.example.landregistrationbangladesh2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.landregistrationbangladesh2 to javafx.fxml;
    opens com.example.landregistrationbangladesh2.FieldSurveyor to javafx.fxml,javafx.base;
    opens com.example.landregistrationbangladesh2.LegalAdvisor to javafx.fxml,javafx.base;
    opens com.example.landregistrationbangladesh2.LandBroker to javafx.fxml,javafx.base;
    opens com.example.landregistrationbangladesh2.Lawyer to javafx.fxml,javafx.base;


    exports com.example.landregistrationbangladesh2;
}