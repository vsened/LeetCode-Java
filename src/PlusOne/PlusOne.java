package PlusOne;

import java.sql.Array;
/**
 * Plus One
 * <p>
 * You are given a large integer represented as an integer array digits, where each
 * digits[i] is the ith digit of the integer. The digits are ordered from most
 * significant to least significant in left-to-right order. The large integer does
 * not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        var isIncrease = true;
        for (int i = 0; i < digits.length; i++){
            var current = isIncrease ? digits[digits.length - 1 - i] + 1 : digits[digits.length - 1 - i];
            digits[digits.length - 1 - i] = current > 9 ? 0 : current;
            isIncrease = current > 9 ? true : false;
        }
        if (isIncrease) {
            var result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 0; i < digits.length; i++){
                result[i+1] = digits[i];
            }
            return result;
        }
        return digits;
    }
}
