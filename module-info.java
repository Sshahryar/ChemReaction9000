module your.module.name {
    requires javafx.controls;
    requires javafx.graphics;

    opens UI to javafx.fxml;
    exports UI;

    requires javafx.base;
}
