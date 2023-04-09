package CanPlaceFlowers;

/**
 * <b>Can Place Flowers</b>
 * <p>
 * You have a long flowerbed in which some of the plots are planted, and some are not.
 * However, flowers cannot be planted in adjacent plots.
 * </p>
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1
 * means not empty, and an integer n, return true if n new flowers can be planted in
 * the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int total = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            int canPlant = ((i - 1 < 0 ? 0 : flowerbed[i - 1])
                    + flowerbed[i]
                    + (i + 1 > flowerbed.length - 1 ? 0 : flowerbed[i + 1])) == 0 ? 1 : 0;
            if (canPlant == 1) {
                flowerbed[i] = 1;
                total++;
            }
        }
        return total >= n;
    }
}
