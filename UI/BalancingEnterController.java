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
        String balancedReaction = balanceReactionType(reaction);
        resultTextArea.setText("Balanced Reaction:\n" + balancedReaction);
    }

    private String balanceReactionType(String reaction) {
        if (isSynthesisReaction(reaction)) {
            return balanceSynthesis(reaction);
        } else if (isDecompositionReaction(reaction)) {
            return balanceDecomposition(reaction);
        } else if (isIonicReaction(reaction)) {
            return balanceIonic(reaction);
        } else {
            return "Unknown reaction type";
        }
    }

    private boolean isSynthesisReaction(String reaction) {
        return reaction.contains("->");
    }

    private boolean isDecompositionReaction(String reaction) {
        return reaction.contains("->");
    }

    private boolean isIonicReaction(String reaction) {
        return reaction.contains("+") || reaction.contains("-");
    }

    private String balanceSynthesis(String reaction) {
        return "Balanced synthesis reaction: " + reaction + " -> ???";
    }

    private String balanceDecomposition(String reaction) {
        return "Balanced decomposition reaction: " + reaction + " -> ???";
    }

    private String balanceIonic(String reaction) {
        return "Balanced ionic equation: " + reaction + " -> ???";
    }

    public VBox getView() {
        VBox view = new VBox(10);
        view.getChildren().addAll(reactionInput, balanceButton, resultTextArea);
        return view;
    }
}
