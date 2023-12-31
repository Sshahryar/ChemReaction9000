package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BalancingEnter extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button balanceButton = new Button("Balance Reaction");
        balanceButton.setOnAction(this::balanceReaction);

        StackPane root = new StackPane();
        root.getChildren().add(balanceButton);

        primaryStage.setTitle("Chemical Reaction Simulator");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void balanceReaction(ActionEvent actionEvent) {
        // Implement your balancing logic here
    }
}
