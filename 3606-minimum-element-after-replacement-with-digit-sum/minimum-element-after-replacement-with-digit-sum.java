class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE; 
        for(int i =0; i<n; i++){
            int rev = nums[i];
            int sum = 0;
           while(rev != 0){
             sum = sum + rev % 10;
             rev = rev/10;
           }
           min = Math.min(min, sum);
        }
        return min;
    }
}