package NthTribonacciNumber;

import java.util.ArrayList;

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        var trib = new ArrayList<Integer>();
        trib.add(0);
        trib.add(1);
        trib.add(1);
        for (int i = 3; i <= n; i++)
            trib.add(trib.get(i-3) + trib.get(i-2) + trib.get(i-1));
        return trib.get(n);
    }
}
