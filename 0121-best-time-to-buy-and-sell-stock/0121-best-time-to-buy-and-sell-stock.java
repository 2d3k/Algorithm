class Solution {
    public int maxProfit(int[] prices) {

        int max = prices[0];
        int min = prices[0];
        int result = 0;

        for (int i = 1; i < prices.length; i++) {

            if (min > prices[i]) {
                min = prices[i];
                max = prices[i];
            }

            if (max < prices[i]) {
                max = prices[i];
            }

            result = Math.max(result, max - min);

        }

        return result;
        
    }
}