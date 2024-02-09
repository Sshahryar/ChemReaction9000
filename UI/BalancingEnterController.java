package UI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BalancingEnterController {

    @FXML
    private TextField reactionInput;

    @FXML
    private Button balanceButton;

    @FXML
    private TextArea resultTextArea;

    @FXML
    private void initialize() {
        balanceButton.setOnAction(this::balanceReaction);
    }

    private void balanceReaction(ActionEvent event) {
        String reaction = reactionInput.getText();
        String balancedReaction = balanceReaction(reaction);
        resultTextArea.setText("Balanced Reaction:\n" + balancedReaction);
    }

    private String balanceReaction(String reaction) {
        return reaction; 
    }
}
