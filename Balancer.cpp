#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>

std::unordered_map<std::string, int> countElements(const std::string& compound) {
    std::unordered_map<std::string, int> elements;
    return elements;
}

std::string balanceSynthesis(const std::string& reactants, const std::string& product) {
    std::unordered_map<std::string, int> reactantElements = countElements(reactants);
    std::unordered_map<std::string, int> productElements = countElements(product);

    std::string balancedReaction = "Balanced synthesis reaction: " + reactants + " -> " + product;
    return balancedReaction;
}

std::string balanceDecomposition(const std::string& compound) {
    std::unordered_map<std::string, int> compoundElements = countElements(compound);

    std::string balancedReaction = "Balanced decomposition reaction: " + compound + " -> ";
    return balancedReaction;
}

int main() {
    std::string synthesisReactants = "H2 + O2";
    std::string synthesisProduct = "H2O";
    std::string balancedSynthesis = balanceSynthesis(synthesisReactants, synthesisProduct);
    std::cout << balancedSynthesis << std::endl;

    std::string compound = "H2O";
    std::string balancedDecomposition = balanceDecomposition(compound);
    std::cout << balancedDecomposition << std::endl;

    return 0;
    
}
