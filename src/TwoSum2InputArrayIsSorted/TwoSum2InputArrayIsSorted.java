package TwoSum2InputArrayIsSorted;

import java.util.HashMap;
/** <b>Two Sum II - Input Array Is Sorted</b>
 * <p>
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number. Let these two numbers
 * be numbers at index1 and numbers at index2 where 1 <= index1 < index2 <= numbers.length.
 * </p>
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array
 * [index1, index2] of length 2.
 * <p>
 * The tests are generated such that there is exactly one solution. You may not use the same
 * element twice.
 * </p>
 * Your solution must use only constant extra space.
 */
public class TwoSum2InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        var hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++){
            if (hashmap.containsKey(target - numbers[i]))
                return new int[]{hashmap.get(target - numbers[i]), i + 1};
            if (!hashmap.containsKey(numbers[i]))
                hashmap.put(numbers[i], i+1 );
        }
        return new int[2];
    }
}
