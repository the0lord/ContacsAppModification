module com.example.contacsappmodification {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contacsappmodification to javafx.fxml;
    exports com.example.contacsappmodification;
}