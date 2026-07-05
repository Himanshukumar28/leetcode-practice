class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        //Precompute 
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<k; i++){
            sum = sum + nums[i];
        }
        max = sum;
        //Now Start form the Second
        for(int i = 1; i<=n-k; i++){
            //Shrink
            sum = sum - nums[i-1];
            //Expand
            sum = sum + nums[i+k-1];
            //Update
            max = Math.max(max, sum);
        }
        return (double)max/k;
    }
}