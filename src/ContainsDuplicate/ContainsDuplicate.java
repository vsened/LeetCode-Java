package ContainsDuplicate;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        var dict = new HashMap<Integer, Integer>();
        for (var num : nums) {
            if (dict.containsKey(num))
                return true;
            dict.put(num, 1);
        }
        return false;
    }
}
