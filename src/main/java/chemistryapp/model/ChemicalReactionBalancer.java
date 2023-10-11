import java.util.Scanner;

public class ChemicalReactionBalancer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the chemical reaction: ");
        String reaction = scanner.nextLine();

        String balancedReaction = balanceReaction(reaction);

        System.out.println("The balanced chemical reaction is: " + balancedReaction);

        scanner.close();
    }

    private static String balanceReaction(String reaction) {
        // Your code here
        // This method should return the balanced chemical reaction
        // You can use a different approach or library to balance the reaction
        return reaction;
    }
}
