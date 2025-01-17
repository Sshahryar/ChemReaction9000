import javafx.application.Application; 
import javafx.fxml.FXMLLoader; 
import javafx.scene.Parent; 
import javafx.scene.Scene; 
import javafx.stage.Stage;

public class BalancingEnter extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Starting application...");
        Parent root = loadFXML("BalancingEnter.fxml");
        System.out.println("FXML loaded successfully.");
        primaryStage.setTitle("Chemical Reaction Balancer");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
        System.out.println("Application launched.");
    }

    private Parent loadFXML(String fxmlFileName) throws IOException {
        System.out.println("Loading FXML: " + fxmlFileName);
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
        return loader.load();
    }

    public static void main(String[] args) {
        System.out.println("Launching application...");
        launch(args);
        System.out.println("Main method finished.");
    }
}
