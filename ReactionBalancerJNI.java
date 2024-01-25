public class ReactionBalancerJNI public class ReactionBalancerJNI {
    static {
        System.load("<path-to-your-library>/YourLibraryName.so"); // or YourLibraryName.dll on Windows
    }

    public native String balanceReaction(String reaction);
}
