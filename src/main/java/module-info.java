module com.example.zarchat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zarchat to javafx.fxml;
    exports com.example.zarchat;
}