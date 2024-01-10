#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>


std::unordered_map<std::string, int> countElements(const std::string& compound) {
    std::unordered_map<std::string, int> elementCount;

    std::string currentElement;
    int currentCount = 0;

    for (char ch : compound) {
        if (std::isupper(ch)) {
            if (!currentElement.empty()) {
                elementCount[currentElement] += (currentCount == 0 ? 1 : currentCount);
            }

            currentElement = ch;
            currentCount = 0;
        } else if (std::islower(ch)) {
            currentElement += ch;
        } else if (std::isdigit(ch)) {
            currentCount = currentCount * 10 + (ch - '0');
        }
    }

    if (!currentElement.empty()) {
        elementCount[currentElement] += (currentCount == 0 ? 1 : currentCount);
    }

    return elementCount;
}

std::string balanceReaction(const std::string& reaction) {

    std::unordered_map<std::string, int> elementCount = countElements("CH4");

std::string balanceReaction(const std::string& reaction) {

    return "Balanced reaction: " + reaction;
}

int main() {

    std::string unbalancedReaction = "CH4 + O2 -> CO2 + H2O";
    std::string balancedReaction = balanceReaction(unbalancedReaction);

    std::cout << balancedReaction << std::endl;

    return 0;
}

