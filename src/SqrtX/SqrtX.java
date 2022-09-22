package SqrtX;

public class SqrtX {
    public static int mySqrt(int x) {
        if (x <= 1)
            return x;
        int lo = 1;
        int hi = x / 2;
        int mid = 0;
        long sqrtMid = (long)mid * (long)mid;
        while(lo <= hi){
            mid = (lo + hi) / 2;
            sqrtMid = (long)mid * (long)mid;
            if (sqrtMid == x)
                return mid;
            else if (sqrtMid < x)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return sqrtMid > x ? mid - 1 : mid;
    }
    public int mySqrt2(int x) {
        if(x == 0){
            return 0;
        }
        int start = 1;
        int end = x;
        int ans = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid <= x/mid){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
}
