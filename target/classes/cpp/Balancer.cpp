#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>

std::string balanceReaction(const std::string& reaction) {

    return "Balanced reaction: " + reaction;
}

int main() {

    std::string unbalancedReaction = "CH4 + O2 -> CO2 + H2O";
    std::string balancedReaction = balanceReaction(unbalancedReaction);

    std::cout << balancedReaction << std::endl;

    return 0;
}

