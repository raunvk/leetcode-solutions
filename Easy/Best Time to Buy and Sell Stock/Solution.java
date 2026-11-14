class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuyCost = prices[0];
        for(int i=1; i<prices.length; i++) {
            int profit = prices[i] - minBuyCost;
            if(profit > maxProfit) {
                maxProfit = profit;
            }
            if(prices[i] < minBuyCost) {
                minBuyCost = prices[i];
            }
        }
        return maxProfit;
    }
}