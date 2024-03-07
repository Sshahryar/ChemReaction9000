#ifndef CHEMICAL_BALANCER_WRAPPER_H
#define CHEMICAL_BALANCER_WRAPPER_H

#include <string>

class ChemicalBalancerWrapper {
public:
    ChemicalBalancerWrapper();
    ~ChemicalBalancerWrapper();

    std::string balanceChemicalReaction(const std::string& reaction);
};

#endif // CHEMICAL_BALANCER_WRAPPER_H
