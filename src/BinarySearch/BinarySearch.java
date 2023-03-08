package BinarySearch;
/**
 * Binary Search
 * <p>
 * Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums. If target exists, then return its index. Otherwise,
 * return -1.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        var left = 0;
        var right = nums.length;
        while(left <= right){
            var mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}
