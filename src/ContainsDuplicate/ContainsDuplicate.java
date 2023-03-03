package ContainsDuplicate;

import java.util.HashMap;
import java.util.HashSet;
/**
 * 217. Contains Duplicate.*
 * Given an integer array nums, return true if
 * any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class ContainsDuplicate {
    /**
     * Using HashMap
     */
    public boolean containsDuplicate(int[] nums) {
        var dict = new HashMap<Integer, Integer>();
        for (var num : nums) {
            if (dict.containsKey(num))
                return true;
            dict.put(num, 1);
        }
        return false;
    }
    /**
     * Using HashSet
     */
    public boolean containsDuplicate2(int[] nums) {
        var set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }
}
