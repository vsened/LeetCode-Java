package ValidPalindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = clearString(s);
        for (int i = 0; i < s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
    private static String clearString(String s){
        String result = "";
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i)))
                result += Character.toLowerCase(s.charAt(i));
        }
        return result;
    }
    public static boolean isPalindrome2(String s) {
        var min = 0;
        var max = s.length()-1;
        while(min <= max){
            if (!Character.isLetterOrDigit(s.charAt(min))){
                min++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(max))){
                max--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(min)) != Character.toLowerCase(s.charAt(max)))
                return false;
            min++;
            max--;
        }
        return true;
    }
}
