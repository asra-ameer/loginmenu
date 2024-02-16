module org.example.loginmenu {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.loginmenu to javafx.fxml;
    exports org.example.loginmenu;
}