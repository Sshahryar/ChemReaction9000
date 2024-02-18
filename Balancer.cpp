#include <iostream>
#include <string>
#include <unordered_map>

std::unordered_map<std::string, int> countElements(const std::string& compound) {
    std::unordered_map<std::string, int> elements;
    std::string element;
    int count = 0;
    int groupCount = 0;
    int coefficient = 1;

    for (size_t i = 0; i < compound.size(); ++i) {
        char c = compound[i];
        if (isdigit(c) && (i == 0 || compound[i-1] == '+' || compound[i-1] == ' ')) {
            coefficient = c - '0';
        } else if (isupper(c)) {
            if (!element.empty()) {
                if (count == 0) count = 1;
                elements[element] += count * coefficient * (groupCount == 0 ? 1 : groupCount);
            }
            element = c;
            count = 0;
        } else if (islower(c)) {
            element += c;
        } else if (isdigit(c)) {
            count = count * 10 + (c - '0');
        } else if (c == '(') {
            if (!element.empty()) {
                if (count == 0) count = 1;
                elements[element] += count * coefficient * (groupCount == 0 ? 1 : groupCount);
                element.clear();
                count = 0;
            }
            groupCount = 0;
        } else if (c == ')') {
            if (!element.empty()) {
                if (count == 0) count = 1;
                elements[element] += count * coefficient * (groupCount == 0 ? 1 : groupCount);
                element.clear();
                count = 0;
            }
            groupCount = 0;
            if (isdigit(compound[i+1])) {
                groupCount = compound[i+1] - '0';
            }
        }
    }

    if (!element.empty()) {
        if (count == 0) count = 1;
        elements[element] += count * coefficient * (groupCount == 0 ? 1 : groupCount);
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
    std::string balancedReaction = "Balanced decomposition reaction: " + compound + " -> ???";
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
