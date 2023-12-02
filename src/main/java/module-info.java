module com.example.application {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.application to javafx.fxml;
    exports com.example.application;
}