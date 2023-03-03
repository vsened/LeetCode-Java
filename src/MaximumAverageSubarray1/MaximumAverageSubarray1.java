package MaximumAverageSubarray1;
/**
 * Maximum Average Subarray I.
 *
 * You are given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has the maximum average
 * value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 */
public class MaximumAverageSubarray1 {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvrg = 0;
        for (int i = 0; i < k; i++){
            maxAvrg += (double) nums[i];
        }
        maxAvrg /= k;
        var currentAvrd = maxAvrg;
        for (int i = k; i < nums.length; i++){
            currentAvrd = (currentAvrd * k - nums[i - k] + nums[i] )/ k;
            if (currentAvrd > maxAvrg)
                maxAvrg = currentAvrd;
        }
        return maxAvrg;
    }
}
