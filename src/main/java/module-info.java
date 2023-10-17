module com.example.udemy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.udemy to javafx.fxml;
    exports com.example.udemy;
}