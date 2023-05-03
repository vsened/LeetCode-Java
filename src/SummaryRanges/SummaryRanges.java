package SummaryRanges;

import java.util.ArrayList;
import java.util.List;

/** <b>Summary Ranges</b>
 * <p>
 * You are given a sorted unique integer array nums.
 * </p>
 * A range [a,b] is the set of all integers from a to b (inclusive).
 * <p>
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is,
 * each element of nums is covered by exactly one of the ranges, and there is no integer x such that x
 * is in one of the ranges but not in nums.
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        var result = new ArrayList<String>();
        for (int i = 0; i < nums.length; i++) {
            var s = nums[i];
            while(true) {
                if (i == nums.length - 1) {
                    if (s == nums[i]) {
                        result.add("" + s);
                    } else {
                        result.add(s + "->" + nums[i]);
                    }
                    break;
                } else if (nums[i] + 1 != nums[i+1]) {
                    if (s == nums[i]) {
                        result.add("" + s);
                    } else {
                        result.add(s + "->" + nums[i]);
                    }
                    break;
                } else {
                    i++;
                }
            }
        }
        return result;
    }
}
