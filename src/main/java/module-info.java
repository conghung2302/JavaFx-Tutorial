module com.example.demojavafx {

//    requires javafx.web;

    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires javafx.web;


    opens com.example.demojavafx to javafx.fxml;
    opens com.example.Tutorial to javafx.fxml;

    exports com.example.demojavafx;
    exports com.example.Tutorial;
}