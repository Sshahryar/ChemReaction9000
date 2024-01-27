#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>

std::unordered_map<std::string, int> countElements(const std::string& compound) {
}

std::vector<std::vector<int>> buildMatrix(const std::unordered_map<std::string, int>& elementCount, const std::vector<std::string>& compounds) {
}

void solveMatrix(std::vector<std::vector<int>>& matrix) {
}

std::string balanceReaction(const std::string& reaction) {
    std::unordered_map<std::string, int> elementCount = countElements(reaction);

    std::vector<std::vector<int>> coefficientMatrix = buildMatrix(elementCount, /* Define or pass 'compounds' here */);

    solveMatrix(coefficientMatrix);
    
    return "Balanced reaction: " + reaction;
}

int main() {
    std::string unbalancedReaction = "CH4 + O2 -> CO2 + H2O";
    std::string balancedReaction = balanceReaction(unbalancedReaction);

    std::cout << balancedReaction << std::endl;

    return 0;
}