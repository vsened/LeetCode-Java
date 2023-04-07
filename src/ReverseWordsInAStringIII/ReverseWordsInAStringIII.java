package ReverseWordsInAStringIII;

import java.util.ArrayList;

/** <b>Reverse Words in a String III</b>
 * <p></p>
 * Given a string s, reverse the order of characters in each word within a
 * sentence while still preserving whitespace and initial word order.
 */
public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        int start = 0;
        int end = 0;
        StringBuilder sb = new StringBuilder();
        while (end < s.length()) {
            while(!String.valueOf(s.charAt(end)).equals(" ")
                    && end < s.length()-1) {
                end++;
            }
            if (end == s.length()-1) {
                end++;
            }
            String substring = s.substring(start, end);
            sb.append(reverseString(substring));
            if (end < s.length()-1) {
                sb.append(" ");
            }
            start = ++end;
        }
        return sb.toString();
    }

    public String reverseString(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
