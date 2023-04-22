package LicenseKeyFormatting;

import java.util.ArrayList;
import java.util.Collections;

/** <b>License Key Formatting</b>
 * <p>
 * You are given a license key represented as a string s that consists of only alphanumeric characters and dashes.
 * The string is separated into n + 1 groups by n dashes. You are also given an integer k.
 * </p>
 * We want to reformat the string s such that each group contains exactly k characters, except for the first group,
 * which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash
 * inserted between two groups, and you should convert all lowercase letters to uppercase.
 * <p>
 * Return the reformatted license key.
 * </p>
 */
public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        String curString = "";
        var splits = new ArrayList<String>();
        for (int i = s.length()-1; i >=0; i--) {
            if (curString.length() == k) {
                splits.add(curString);
                curString = "";
            }
            if (s.charAt(i) != '-') {
                curString = Character.toUpperCase(s.charAt(i)) + curString;
            }
        }
        if (!curString.isEmpty()) {
            splits.add(curString);
        }
        Collections.reverse(splits);
        return String.join("-", splits);
    }
}
