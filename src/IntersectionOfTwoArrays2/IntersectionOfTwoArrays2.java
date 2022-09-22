package IntersectionOfTwoArrays2;

import java.awt.List;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        var hashmap = new HashMap<Integer, Integer>();
        var result = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++){
            if (!hashmap.containsKey(nums1[i]))
                hashmap.put(nums1[i], 1);
            else
                hashmap.put(nums1[i], hashmap.get(nums1[i]) + 1);
        }

        for (int i = 0; i < nums2.length; i++){
            if (hashmap.containsKey(nums2[i]) && hashmap.get(nums2[i]) > 0){
                result.add(nums2[i]);
                hashmap.put(nums2[i], hashmap.get(nums2[i]) - 1);
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < resultArray.length; i++){
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
