package PalindromeNumber;

/**
 * 9. Palindrome Number
 * Given an integer x, return true if x is palindrome integer.
 */

public class PalindromeNumber {
    /**
     * Using string
     */
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        var left = 0;
        var right = number.length() - 1;
        while(left < right){
            if (number.charAt(left) != number.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Math manipulation
     */
    public boolean isPalindrome2(int x) {
        var number = x;
        var reverseNumber = 0;
        while (x > 0){
            var temp = x % 10;
            x /= 10;
            reverseNumber *= 10;
            reverseNumber += temp;
        }
        return number == reverseNumber;
    }
}
