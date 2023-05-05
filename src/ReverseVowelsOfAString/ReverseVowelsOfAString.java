package ReverseVowelsOfAString;
/** <b>Reverse Vowels of a String</b>
 * <p>
 * Given a string s, reverse only all the vowels in the string and return it.
 * </p>
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        var vowels = "aeiouAEIOU";
        var end = s.length() - 1;
        String result = "";
        for (int start = 0; start < s.length(); start++) {
            if (vowels.contains(String.valueOf(s.charAt(start)))) {
                while (end > -1) {
                    if (vowels.contains(String.valueOf(s.charAt(end)))) {
                        break;
                    }
                    end--;
                }
                result += s.charAt(end--);
            } else {
                result += s.charAt(start);
            }
        }
        return result;
    }
}
