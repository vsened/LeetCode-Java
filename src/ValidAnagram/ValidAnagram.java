package ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;

/** <b> Valid Anagram </b>
 * <p>
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * </p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word
 * or phrase, typically using all the original letters exactly once.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        var sHash = new HashMap<Character, Integer>();
        var tHash = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            sHash.put(s.charAt(i), sHash.getOrDefault(s.charAt(i), 0) + 1);
            tHash.put(t.charAt(i), tHash.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (var key : tHash.keySet()) {
            if (!sHash.containsKey(key)
                    || !sHash.get(key).equals(tHash.get(key))) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(charT);

        return Arrays.equals(charS, charT);
    }
}
