package BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        var min = prices[0];
        var max = prices[0];
        var different = 0;
        for(int i = 0; i < prices.length; i++){
            if (prices[i] < min){
                min = prices[i];
                max = prices[i];
            }
            else if (prices[i] > max)
                max = prices[i];
        }
        return (different > (max - min)) ? different : (max-min);
    }
}
