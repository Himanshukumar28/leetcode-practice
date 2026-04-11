class Solution {
    public int findPeakElement(int[] nums) {
         int n = nums.length;
         int max = Integer.MIN_VALUE;
         for(int i = 0; i<n; i++){
            max = Math.max(max , nums[i]);
         }
         for(int i = 0; i<n; i++){
            if(max == nums[i]){
                return i;  //ans
            }
         }
         return -1; //This line never run
    }
}