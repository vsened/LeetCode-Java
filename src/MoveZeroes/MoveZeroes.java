package MoveZeroes;

/**
 * Move Zeroes.
 * <p>
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                var currentIndex = i + 1;
                while (currentIndex < nums.length && nums[currentIndex] == 0)
                    currentIndex++;
                if (currentIndex == nums.length)
                    break;
                else {
                    var temp = nums[currentIndex];
                    nums[currentIndex] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}
