package CountingBits;
/**
 * Counting Bits.
 * Given an integer n, return an array ans of length n + 1
 * such that for each i (0 <= i <= n), ans[i] is the number
 * of 1's in the binary representation of i.
 */
public class CountingBits {
    /**
     * Using string's methods.
     */
    public int[] countBits(int n) {
        var result = new int[n+1];
        for (int i = 0; i <= n; i++){
            result[i] = Integer.toBinaryString(i).replace("0", "").length();
        }
        return result;
    }
    /**
     * Bits manipulation.
     */
    public int[] countBits2(int n) {
        var result = new int[n+1];
        for (int i = 0; i <= n; i++){
            var number = i;
            var count = 0;
            while (number != 0){
                count++;
                number = number & (number - 1);
            }
            result[i] = count;
        }
        return result;
    }
}
