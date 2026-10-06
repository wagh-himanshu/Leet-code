class Solution {
    public int maxProfit(int[] prices) {
        // Edge case: if there are no prices or only one day, no profit can be made
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}
