
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

class BalancingEnter extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = loadFXML("BalancingEnter.fxml");

        primaryStage.setTitle("Chemical Reaction Balancer");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }

    private Parent loadFXML(String fxmlFileName) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
        return loader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
