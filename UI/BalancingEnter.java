package UI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BalancingEnter extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Chemical Reaction Simulator");

        // Creation of UI elements
        Label titleLabel = new Label("Enter Chemical Reaction:");
        TextField reactionInput = new TextField();
        Button balanceButton = new Button("Balance");
        TextArea resultTextArea = new TextArea();

        // Balance button placeholder
        balanceButton.setOnAction(e -> {
            // Calls the method for getting reaction input
            String reaction = reactionInput.getText();
            String balancedReaction = balanceReaction(reaction);
            resultTextArea.setText("Balanced Reaction:\n" + balancedReaction);
        });

        // Grid layout based alignment
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.add(titleLabel, 0, 0, 2, 1);
        grid.add(reactionInput, 0, 1, 2, 1);
        grid.add(balanceButton, 0, 2, 2, 1);
        grid.add(resultTextArea, 0, 3, 2, 1);

        // Create a scene and set it on the stage
        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Input reaction model later
    private String balanceReaction(String reaction) {

        // Where reaction model will be based
        // Base input for now

        return reaction;
    }
}
