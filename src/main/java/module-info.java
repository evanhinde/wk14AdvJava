module com.example.wk14 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wk14 to javafx.fxml;
    exports com.example.wk14;
}