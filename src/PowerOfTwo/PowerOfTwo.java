package PowerOfTwo;
/** <b>Power of Two</b>
 * <p>
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 * </p>
 * An integer n is a power of two, if there exists an integer x such that n == 2^x.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n <= 0) return false;
        while(n > 1) {
            if (n % 2 != 0) return false;
            n /= 2;
        }
        return true;
    }
}
