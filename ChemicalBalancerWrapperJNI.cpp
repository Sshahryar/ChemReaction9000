#include "ChemicalBalancerWrapper.h"
#include "Balancer.cpp"

JNIEXPORT jstring JNICALL Java_ChemicalBalancer_balanceChemicalReaction(JNIEnv* env, jobject obj, jstring reaction) {
    const char* reactionStr = env->GetStringUTFChars(reaction, nullptr);
    std::string result = countElements(reactionStr); 
    env->ReleaseStringUTFChars(reaction, reactionStr);

    return env->NewStringUTF(result.c_str());
}

