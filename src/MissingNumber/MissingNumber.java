package MissingNumber;
/** <b>Missing Number</b>
 * <p></p>
 *  Given an array nums containing n distinct numbers in the range [0, n], return the
 *  only number in the range that is missing from the array.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        var sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return getRangeSum(nums.length) - sum;
    }

    private int getRangeSum(int number) {
        var sum = 0;
        var tmp = 0;
        while (tmp <= number) {
            sum += tmp++;
        }
        return sum;
    }
}
