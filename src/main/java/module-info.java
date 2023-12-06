module com.example.wk14 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;


    opens com.example.wk14 to javafx.fxml, com.google.gson;
    exports com.example.wk14;
}