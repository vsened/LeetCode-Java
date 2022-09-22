package SingleNumber;

import java.util.HashMap;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        var numbers = new HashMap<Integer, Integer>();
        for (var num : nums) {
            numbers.put(num, numbers.getOrDefault(num, 0)+1);
        }
        for (var key : numbers.keySet()){
            if (numbers.get(key) == 1)
                return key;
        }
        return 0;
    }

    public static int singleNumberXOR(int[] nums) {
        int uniqNum = 0;
        for (int idx : nums) {
            uniqNum ^= idx;
        }
        return uniqNum;
    }
}