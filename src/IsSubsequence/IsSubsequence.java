package IsSubsequence;

import java.util.HashMap;

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
