package HammingDistance;
/** <b>Hamming Distance</b>
 * <p>
 *  The Hamming distance between two integers is the number of positions at which
 *  the corresponding bits are different.
 * <p>
 * Given two integers x and y, return the Hamming distance between them.
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        var result = 0;
        var xor = Integer.toBinaryString(x ^ y);
        for (int i = 0; i < xor.length(); i++) {
            if (xor.charAt(i) != '0'){
                result++;
            }
        }
        return result;
    }
}
