package PowerOfFour;
/** <b>Power of Four</b>
 * <p>
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 * </p>
 * An integer n is a power of four, if there exists an integer x such that n == 4x.
 */
public class PowerOfFour {
    /**
     * Using math
     */
    public boolean isPowerOfFour(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }
        return true;
    }

    /**
     * Using string
     */
    public boolean isPowerOfFour2(int n) {
        return Integer.toBinaryString(n).replace("0", "").length() == 1
                && Integer.toBinaryString(n).length() % 2 != 0;
    }

}
