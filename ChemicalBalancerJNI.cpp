#include <jni.h>
#include "ChemicalBalancer.h"

extern "C" {

JNIEXPORT jstring JNICALL Java_UI_BalancingEnterController_balanceChemicalReaction(JNIEnv* env, jobject obj, jstring j_reaction) {
    const char* reaction = env->GetStringUTFChars(j_reaction, NULL);
    std::string balancedReaction = balanceChemicalReaction(reaction);
    env->ReleaseStringUTFChars(j_reaction, reaction);
    return env->NewStringUTF(balancedReaction.c_str());
}

}
