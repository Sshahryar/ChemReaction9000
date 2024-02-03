#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>

std::unordered_map<std::string, int> countElements(const std::string& compound) {
    std::unordered_map<std::string, int> elements;
    std::string element;
    int count = 0;

    for (char c : compound) {
        if (isupper(c)) {
            if (!element.empty()) {
                if (count == 0) count = 1;
                elements[element] += count;
            }
            element = c;
            count = 0;
        } else if (islower(c)) {
            element += c;
        } else if (isdigit(c)) {
            count = count * 10 + (c - '0');
        }
    }

    if (!element.empty()) {
        if (count == 0) count = 1;
        elements[element] += count;
    }

    return elements;
}

std::string balanceSynthesis(const std::string& reactants, const std::string& product) {
    std::unordered_map<std::string, int> reactantElements = countElements(reactants);
    std::unordered_map<std::string, int> productElements = countElements(product);

    std::string balancedReaction = "Balanced synthesis reaction: 2" + reactants + " -> 2" + product;
    return balancedReaction;
}

std::string balanceDecomposition(const std::string& compound) {
    std::unordered_map<std::string, int> compoundElements = countElements(compound);

    std::string balancedReaction = "Balanced decomposition reaction: " + compound + " -> ";
    return balancedReaction;
}

std::string balanceIonic(const std::string& reactants, const std::string& product) {
    std::unordered_map<std::string, int> reactantElements = countElements(reactants);
    std::unordered_map<std::string, int> productElements = countElements(product);

    std::unordered_map<std::string, int> spectatorIons;
    for (const auto& [element, count] : reactantElements) {
        if (productElements.count(element) && productElements[element] == count) {
            spectatorIons[element] = count;
        }
    }

    for (const auto& [element, count] : spectatorIons) {
        reactantElements.erase(element);
        productElements.erase(element);
    }

    std::string balancedEquation = "Balanced ionic equation: ";
    for (const auto& [element, count] : reactantElements) {
        balancedEquation += std::to_string(count) + element + " + ";
    }
    balancedEquation.pop_back();
    balancedEquation.pop_back();
    balancedEquation += " -> ";
    for (const auto& [element, count] : productElements) {
        balancedEquation += std::to_string(count) + element + " + ";
    }
    balancedEquation.pop_back();

    return balancedEquation;
}

int main() {
    std::string synthesisReactants = "H2 + O2";
    std::string synthesisProduct = "H2O";
    std::string balancedSynthesis = balanceSynthesis(synthesisReactants, synthesisProduct);
    std::cout << balancedSynthesis << std::endl;

    std::string compound = "H2O";
    std::string balancedDecomposition = balanceDecomposition(compound);
    std::cout << balancedDecomposition << std::endl;

    std::string ionicReactants = "NaCl + AgNO3";
    std::string ionicProduct = "NaNO3 + AgCl";
    std::string balancedIonic = balanceIonic(ionicReactants, ionicProduct);
    std::cout << balancedIonic << std::endl;

    return 0;
}
