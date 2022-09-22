package PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++){
            result.add(new ArrayList<Integer>());
            for (int j = 0; j < i+1;j++){
                if (j == 0 || j == i)
                    result.get(i).add(1);
                else
                    result.get(i).add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
        }
        return result;
    }
}
