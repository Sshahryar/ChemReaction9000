#include <iostream>
#include <string>
#include <unordered_map>

std::unordered_map<std::string, int> countElements(const std::string& compound) {
    std::unordered_map<std::string, int> elementCount;
    return elementCount;
}

void solveMatrix() {
}

std::string balanceReaction(const std::string& reaction) {
    std::unordered_map<std::string, int> elementCount = countElements(reaction);
    solveMatrix();
    return "Balanced reaction: " + reaction;
}

int main() {
    std::string unbalancedReaction = "CH4 + O2 -> CO2 + H2O";
    std::string balancedReaction = balanceReaction(unbalancedReaction);

    std::cout << balancedReaction << std::endl;

    return 0;
}
