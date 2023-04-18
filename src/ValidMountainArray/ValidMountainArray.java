package ValidMountainArray;
/** <b> Valid Mountain Array </b>
 * <p> Given an array of integers arr, return true if and only if it is a valid mountain array. </p>
 */
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        var min = 0;
        for (; min < arr.length; min++) {
            if (min==arr.length-1)
                break;
            if(arr[min]>=arr[min+1])
                break;
        }
        var max = arr.length - 1;
        for (; max > 0; max--){
            if(arr[max]>=arr[max-1])
                break;
        }
        return min==max && min != 0 && max != arr.length-1;
    }
}
