class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buyPrice = Integer.MAX_VALUE;
        int n = prices.length;
        for(int i = 0 ; i < n ; i ++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                max = Math.max(max ,profit);
            } else {
                buyPrice = prices[i];
            }
            
        }
        return max;
    }
}
