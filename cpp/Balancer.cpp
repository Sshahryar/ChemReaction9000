#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>


std::unordered_map<std::string, int> countElements(const std::string& compound) {

}


void solveMatrix(std::vector<std::vector<int>>& matrix) {

}

void adjustCoefficients(std::vector<std::vector<int>>& matrix) {

}

std::vector<std::vector<int>> buildMatrix(const std::unordered_map<std::string, int>& elementCount, const std::vector<std::string>& compounds) {

}

std::string balanceReaction(const std::string& reaction) {
 std::unordered_map<std::string, int> elementCount = countElements("CH4");
   std::vector<std::vector<int>> coefficientMatrix = buildMatrix(elementCount, compounds);
       solveMatrix(coefficientMatrix);
         adjustCoefficients(coefficientMatrix);
          return "Balanced reaction: " + reaction;
}

void solveMatrix(std::vector<std::vector<int>>& matrix) {
    int rows = matrix.size();
    int cols = matrix[0].size();

    for (int i = 0; i < rows; i++) {
        int pivot = matrix[i][i];

        for (int j = i; j < cols; j++) {
            matrix[i][j] /= pivot;
        }
        for (int k = 0; k < rows; k++) {
            if (k != i) {
                int factor = matrix[k][i];
                for (int j = i; j < cols; j++) {
                    matrix[k][j] -= factor * matrix[i][j];
                }
            }
        }
    }
}

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

std::vector<std::vector<int>> buildMatrix(const std::unordered_map<std::string, int>& elementCount, const std::vector<std::string>& compounds) {
    std::vector<std::vector<int>> matrix;

    for (const auto& element : elementCount) {
        std::vector<int> row;
        for (const auto& compound : compounds) {
            row.push_back(countElements(compound)[element.first]);
        }
        matrix.push_back(row);
    }

    return matrix;
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

