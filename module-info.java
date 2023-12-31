module your.module.name {
    requires javafx.controls;
    requires javafx.fxml;

    opens UI to javafx.fxml;

    exports UI;
}
