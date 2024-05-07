module com.example.carracinggame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.carracinggame to javafx.fxml;
    exports com.example.carracinggame;
}