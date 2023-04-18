package VerifyingAnAlienDictionary;

import java.util.HashMap;

/**
 * <b>Verifying an Alien Dictionary</b>
 * <p>
 * In an alien language, surprisingly, they also use English lowercase letters, but possibly
 * in a different order. The order of the alphabet is some permutation of lowercase letters.
 * </p>
 * Given a sequence of words written in the alien language, and the order of the alphabet,
 * return true if and only if the given words are sorted lexicographically in this alien
 * language.
 */
public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        var dict = new HashMap<Character, Integer>();
        for (int i = 0; i < order.length(); i++) {
            dict.put(order.charAt(i), i + 1);
        }
        for (int i = 1; i < words.length; i++) {
            var cursor = 0;
            while (true) {
                if (dict.get(words[i - 1].charAt(cursor)) > dict.get(words[i].charAt(cursor))) {
                    return false;
                } else if (dict.get(words[i - 1].charAt(cursor)) < dict.get(words[i].charAt(cursor))) {
                    break;
                } else {
                    if (words[i - 1].length() - 1 == cursor && words[i].length() - 1 > cursor) {
                        break;
                    } else if (words[i - 1].length() - 1 > cursor && words[i].length() - 1 == cursor) {
                        return false;
                    } else if (words[i - 1].length() - 1 == cursor && words[i].length() - 1 == cursor) {
                        break;
                    } else {
                        cursor++;
                    }
                }
            }
        }
        return true;
    }
}
