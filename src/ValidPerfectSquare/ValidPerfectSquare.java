package ValidPerfectSquare;
/**
 * Valid Perfect Square
 * <p>
 *Given a positive integer num, return true if num is a perfect square or false otherwise.
 *<p>
 * A perfect square is an integer that is the square of an integer. In other words, it is
 * the product of some integer with itself.
 *<p>
 * You must not use any built-in library function, such as sqrt.
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;
        long left = 0;
        long right = num / 2;
        while (left <= right){
            long mid = left + (right - left) / 2;
            if (mid * mid == num)
                return true;
            else if (mid * mid > num)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }
}

