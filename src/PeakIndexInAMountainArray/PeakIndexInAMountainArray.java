package PeakIndexInAMountainArray;

public class PeakIndexInAMountainArray {
    public int peakIndex(int[] arr) {
        var lo = 0;
        var hi = arr.length-1;
        while (lo <= hi){
            var mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid+1] && arr[mid-1] < arr[mid])
                return mid;
            else if (arr[mid+1] > arr[mid])
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }
}
