class Solution {
    public int maxProfit(int[] prices) {

        int max_diff = 0;
        int buy_price = prices[0];
        int i = 1;

        while(i<prices.length) {
            if (prices[i] - buy_price > 0) {
                max_diff = Math.max(prices[i] - buy_price, max_diff);
            } else {
                buy_price = prices[i];
            }
            i++;
        }
        return max_diff;
    }
}