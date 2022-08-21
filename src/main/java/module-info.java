module com.example.launcher {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.example.launcher to javafx.fxml, com.google.gson;
    exports com.example.launcher;
}