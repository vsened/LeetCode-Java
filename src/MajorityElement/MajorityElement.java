package MajorityElement;

import java.util.HashMap;
/** <b>Majority Element </b>
 * <p>
 * Given an array nums of size n, return the majority element.
 * </p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        var elems = new HashMap<Integer, Integer>();
        for (int num : nums) {
            elems.put(num, elems.getOrDefault(num, 0) + 1);
        }
        var max = 0;
        var elem = 0;
        for (int key: elems.keySet()) {
            if (max < elems.get(key)) {
                max = elems.get(key);
                elem = key;
            }
        }
        return elem;
    }
}
