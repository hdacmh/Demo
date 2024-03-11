module com.mycompany.hoang {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.hoang to javafx.fxml;
    exports com.mycompany.hoang;
}
