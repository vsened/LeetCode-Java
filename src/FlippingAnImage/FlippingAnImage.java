package FlippingAnImage;
/** <b>Flipping an Image</b>
 * <p>
 * Given an n x n binary matrix image, flip the image horizontally, then invert it,
 * and return the resulting image.
 * </p>
 * To flip an image horizontally means that each row of the image is reversed.
 * <p>
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * </p>
 * For example, inverting [0,1,1] results in [1,0,0].
 */
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][];
        for (int i = 0; i < image.length; i++) {
            int[] tmp = new int[image[i].length];
            for (int j = 0; j < image[i].length; j++) {
                tmp[image[i].length - j] = image[i][j] == 0 ? 1 : 0;
            }
            result[i] = tmp;
        }
        return result;
    }
}
