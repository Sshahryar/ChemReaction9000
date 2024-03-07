#include "ChemicalBalancerWrapper.h"
#include "ChemicalBalancer.h"

ChemicalBalancerWrapper::ChemicalBalancerWrapper() {}

ChemicalBalancerWrapper::~ChemicalBalancerWrapper() {}

std::string ChemicalBalancerWrapper::balanceChemicalReaction(const std::string& reaction) {
    return ChemicalBalancer::balanceChemicalReaction(reaction);
}
