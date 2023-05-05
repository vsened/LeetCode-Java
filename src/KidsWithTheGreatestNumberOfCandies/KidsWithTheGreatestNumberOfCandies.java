package KidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

/** <b>Kids With the Greatest Number of Candies</b>
 * <p>
 * There are n kids with candies. You are given an integer array candies, where each candies[i]
 * represents the number of candies the ith kid has, and an integer extraCandies, denoting the
 * number of extra candies that you have.
 * </p>
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith
 * kid all the extraCandies, they will have the greatest number of candies among all the kids,
 * or false otherwise.
 * <p>
 * Note that multiple kids can have the greatest number of candies.
 */
public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var result = new ArrayList<Boolean>();
        var max = getMax(candies);
        for (int c : candies) {
            result.add((c + extraCandies >= max));
        }
        return result;
    }
    private int getMax(int[] list) {
        var max = 0;
        for (int number : list) {
            max = Math.max(number, max);
        }
        return max;
    }
}
