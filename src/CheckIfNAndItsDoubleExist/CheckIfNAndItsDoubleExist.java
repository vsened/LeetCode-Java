package CheckIfNAndItsDoubleExist;

import java.util.HashMap;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        var hashmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++){
            if (hashmap.containsKey(arr[i] * 2) || (hashmap.containsKey(arr[i] / 2) && arr[i] % 2 == 0))
                return true;
            if (!hashmap.containsKey(arr[i]))
                hashmap.put(arr[i], i);
        }
        return false;
    }
}
