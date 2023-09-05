module com.example.desktop_link_copy {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires lombok;

    opens com.example.desktop_link_copy to javafx.fxml;
    exports com.example.desktop_link_copy;
}