package PlusOne;

import java.sql.Array;

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
