package UI;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class BalancingEnterController {

    private TextField reactionInput = new TextField();
    private Button balanceButton = new Button("Balance Reaction");
    private TextArea resultTextArea = new TextArea();

    public BalancingEnterController() {
        initialize();
    }

    private void initialize() {
        balanceButton.setOnAction(event -> balanceReaction());
    }

    private void balanceReaction() {
        String reaction = reactionInput.getText();
        String balancedReaction = balanceReaction(reaction);
        resultTextArea.setText("Balanced Reaction:\n" + balancedReaction);
    }

    private String balanceReaction(String reaction) {
        return reaction;
    }

    public VBox getView() {
        VBox view = new VBox(10);
        view.getChildren().addAll(reactionInput, balanceButton, resultTextArea);
        return view;
    }
}

