module com.example.adrianas_homework {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adrianas_homework to javafx.fxml;
    exports com.example.adrianas_homework;
}