class Solution {
    public int arrangeCoins(int n) {
       long sum = 0;
       for(long i = 1; i<=n; i++){
         sum = i*(i+1)/2;

         if(sum == n) return(int) i;
         if(sum > n) return(int) i-1;
       }
         return 0;
    }
}