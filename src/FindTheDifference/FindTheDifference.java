package FindTheDifference;

import java.util.HashMap;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        var hashmap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++){
            hashmap.put(s.charAt(i), hashmap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++){
            if (!hashmap.containsKey(t.charAt(i)))
                return t.charAt(i);
            else{
                if (hashmap.get(t.charAt(i)) == 0)
                    return t.charAt(i);
                else
                    hashmap.put(t.charAt(i), hashmap.get(t.charAt(i)) - 1);
            }
        }
        return '-';
    }
    public char findTheDifferenceXOR(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray())
            c ^= cs;
        for(char ct : t.toCharArray())
            c ^= ct;
        return c;
    }
}
