package UI;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class BalancingEnterController {

    private TextField reactionInput = new TextField();
    private Button balanceButton = new Button("Balance Reaction");
    private Button clearButton = new Button("Clear Fields");
    private TextArea resultTextArea = new TextArea();

    public BalancingEnterController() {
        initialize();
    }

    private void initialize() {
        balanceButton.setOnAction(event -> balanceReaction());
        clearButton.setOnAction(event -> clearFields());
    }

    private void balanceReaction() {
        String reaction = reactionInput.getText();
        String balancedReaction = balanceReaction(reaction);
        resultTextArea.setText("Balanced Reaction:\n" + balancedReaction);
    }

    private void clearFields() {
        reactionInput.clear();
        resultTextArea.clear();
    }

    private String balanceReaction(String reaction) {
        return reaction;
    }

    public VBox getView() {
        VBox view = new VBox(10);
        view.getChildren().addAll(reactionInput, balanceButton, clearButton, resultTextArea);
        return view;
    }
}
