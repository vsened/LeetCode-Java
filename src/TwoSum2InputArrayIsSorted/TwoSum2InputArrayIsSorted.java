package TwoSum2InputArrayIsSorted;

import java.util.HashMap;

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
