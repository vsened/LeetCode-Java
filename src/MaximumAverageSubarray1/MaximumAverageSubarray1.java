package MaximumAverageSubarray1;

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
