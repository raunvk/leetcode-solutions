class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int max = prices[0];
        int min = prices[0];
        for(int i=1; i<prices.length; i++) {
            if(prices[i]<min) {
                min = prices[i];
                max = prices[i];
            }
            if(prices[i]>max) {
                max = prices[i];
            }
            if((max-min)>profit) {
                profit = max-min;
            }
        }
        return profit;
    }
}