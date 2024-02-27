package UI;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
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
        
        balanceButton.setTooltip(createTooltip("Click to balance the chemical reaction."));
        clearButton.setTooltip(createTooltip("Click to clear input and result fields."));
        
        balanceButton.setMnemonicParsing(true);
        balanceButton.setMnemonicKeyCode('B');
        clearButton.setMnemonicParsing(true);
        clearButton.setMnemonicKeyCode('C');
        
        balanceButton.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/images/balance.png"))));
        clearButton.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("/images/clear.png"))));
    }

    private void balanceReaction() {
        String reaction = reactionInput.getText();
        if (isValidReactionFormat(reaction)) {
            String balancedReaction = balanceChemicalReaction(reaction);
            resultTextArea.setText("Balanced Reaction:\n" + balancedReaction);
        } else {
            resultTextArea.setText("Invalid reaction format. Please enter a valid chemical reaction.");
        }
    }

    private boolean isValidReactionFormat(String reaction) {
        return true;
    }

    private void clearFields() {
        reactionInput.clear();
        resultTextArea.clear();
    }

    private String balanceChemicalReaction(String reaction) {
        return "Balanced Chemical Reaction for " + reaction;
    }
    
    private Tooltip createTooltip(String text) {
        Tooltip tooltip = new Tooltip();
        tooltip.setText(text);
        return tooltip;
    }

    public VBox getView() {
        VBox view = new VBox(10);
        view.getChildren().addAll(reactionInput, createButtonBar(), resultTextArea);
        return view;
    }
    
    private HBox createButtonBar() {
        HBox buttonBar = new HBox(10);
        buttonBar.getChildren().addAll(balanceButton, clearButton);
        return buttonBar;
    }
}
