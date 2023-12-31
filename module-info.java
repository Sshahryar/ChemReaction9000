module your.module.name {
    requires javafx.controls;

    opens UI to javafx.fxml;
    exports UI;

    requires javafx.graphics;
    requires javafx.base;
}
