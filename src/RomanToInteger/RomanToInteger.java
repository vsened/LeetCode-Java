package RomanToInteger;

import java.util.HashMap;

/**
 * <b>Roman to Integer</b>
 * <p>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * </p>
 * Given a roman numeral, convert it to an integer.
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        var digits = new HashMap<Character, Integer>();
        digits.put('I', 1);
        digits.put('V', 5);
        digits.put('X', 10);
        digits.put('L', 50);
        digits.put('C', 100);
        digits.put('D', 500);
        digits.put('M', 1000);
        var result = 0;
        var index = 0;
        while (index < s.length()) {
            if (index != s.length() - 1
                    && digits.get(s.charAt(index + 1)) > digits.get(s.charAt(index))) {
                result += digits.get(s.charAt(index + 1)) - digits.get(s.charAt(index));
                index += 2;
            } else {
                result += digits.get(s.charAt(index));
                index++;
            }
        }
        return result;
    }
}
