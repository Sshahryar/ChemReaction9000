module ChemReaction9000 {
    requires javafx.controls;
    requires javafx.graphics;

    opens UI to javafx.fxml;
    exports UI;

    requires javafx.base;
}
