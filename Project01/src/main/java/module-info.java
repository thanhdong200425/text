module com.example.project01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.project01 to javafx.fxml;
    exports com.example.project01;
}