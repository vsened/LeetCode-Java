package IsSubsequence;

import java.util.HashMap;
/**
 * Is Subsequence.
 * <p>
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some
 * (can be none) of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        var sIndx = 0;
        for (int i = 0; i < t.length(); i++){
            if (sIndx < s.length() && t.charAt(i) == s.charAt(sIndx))
                sIndx++;
        }
        return sIndx == s.length();
    }
}
