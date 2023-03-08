package NthTribonacciNumber;

import java.util.ArrayList;
/**
 * N-th Tribonacci Number
 * <p>
 * The Tribonacci sequence Tn is defined as follows:
 * <p>
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 * <p>
 * Given n, return the value of Tn.
 */
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
