import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MinimalFX extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello Minimal JavaFX!");
        Scene scene = new Scene(new StackPane(label), 200, 100);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
