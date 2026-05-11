class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int mi = 0; // index of maximum
        for(int i = 0; i<n; i++){
            if(nums[i] > max){
                max = nums[i];
                mi = i;
            }
        }
        // max = 6 , mi = 1
        for(int i = 0; i<n; i++){
            if(nums[i] == max){
                nums[i] = -1;
            }
        } 
        for(int i =0; i<n; i++){
            if(nums[i] > max/2){
                return -1;
            }
        }
        return mi; 
    }
}