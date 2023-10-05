import java.util.HashMap;
import java.util.Map;

public class ChemicalReactionBalancer {

    public static void main(String[] args) {
        String reactants = "H2 + O2"; // Example reactants
        String products = "H2O";      // Example products

        // Split reactants and products into their components
        String[] reactantComponents = reactants.split("\\s*\\+\\s*");
        String[] productComponents = products.split("\\s*\\+\\s*");

        // Count the number of each element in reactants and products
        Map<String, Integer> reactantCounts = countElements(reactantComponents);
        Map<String, Integer> productCounts = countElements(productComponents);

        // Balancing of equations happens here
        // Implement a balancing algorithm (this is a placeholder)
        Map<String, Integer> balancedCoefficients = balanceReaction(reactantCounts, productCounts);

        // Print the balanced reaction
        printBalancedReaction(balancedCoefficients, reactantComponents, productComponents);
    }

    private static Map<String, Integer> countElements(String[] components) {
        Map<String, Integer> elementCounts = new HashMap<>();
        for (String component : components) {
            String[] parts = component.trim().split("\\s+");
            int coefficient = Integer.parseInt(parts[0]);
            String element = parts[1];
            elementCounts.put(element, elementCounts.getOrDefault(element, 0) + coefficient);
        }
        return elementCounts;
    }

    // Implement a balancing algorithm
    // This is where you would implement a more complex balancing algorithm
    // For simplicity, let's assume the reaction is already balanced
    private static Map<String, Integer> balanceReaction(Map<String, Integer> reactants, Map<String, Integer> products) {
        // Placeholder for the balancing algorithm
        return reactants;
    }

    private static void printBalancedReaction(Map<String, Integer> coefficients, String[] reactants, String[] products) {
        for (String reactant : reactants) {
            int coefficient = coefficients.get(reactant.split("\\s+")[1]);
            System.out.print(coefficient + reactant.substring(1) + " + ");
        }
        System.out.print("-> ");
        for (String product : products) {
            int coefficient = coefficients.get(product.split("\\s+")[1]);
            System.out.print(coefficient + product.substring(1) + " + ");
        }
        System.out.println();
    }
}
