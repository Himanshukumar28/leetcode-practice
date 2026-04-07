class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minp = prices[0];
        int maxp = 0;
        for(int i = 0; i<n; i++){
            int currentpro = prices[i] - minp; 
            minp = Math.min(minp , prices[i]);
            maxp = Math.max(maxp , currentpro);      
        }
        return maxp;
    }
}