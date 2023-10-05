import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChemicalReactionBalancer {

    public static void main(String[] args) {
        String reactants = "2H2 + O2"; // Example reactants
        String products = "2H2O";      // Example products

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
            Matcher matcher = Pattern.compile("(\\d*)([A-Za-z]+)").matcher(component.trim());
            while (matcher.find()) {
                int coefficient = 1;
                if (!matcher.group(1).isEmpty()) {
                    coefficient = Integer.parseInt(matcher.group(1));
                }
                String element = matcher.group(2);
                elementCounts.put(element, elementCounts.getOrDefault(element, 0) + coefficient);
            }
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
            Matcher matcher = Pattern.compile("(\\d*)([A-Za-z]+)").matcher(reactant.trim());
            while (matcher.find()) {
                int coefficient = 1;
                if (!matcher.group(1).isEmpty()) {
                    coefficient = Integer.parseInt(matcher.group(1));
                }
                System.out.print(coefficient + matcher.group(2) + " + ");
            }
        }
        System.out.print("-> ");
        for (String product : products) {
            Matcher matcher = Pattern.compile("(\\d*)([A-Za-z]+)").matcher(product.trim());
            while (matcher.find()) {
                int coefficient = 1;
                if (!matcher.group(1).isEmpty()) {
                    coefficient = Integer.parseInt(matcher.group(1));
                }
                System.out.print(coefficient + matcher.group(2) + " + ");
            }
        }
        System.out.println();
    }
}
