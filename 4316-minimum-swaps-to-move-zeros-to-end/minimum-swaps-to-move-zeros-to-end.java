class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int zerocount = 0;
        for(int num : nums){
            if(num == 0) zerocount++;
        }
        int swap = 0;
        for(int i = n-zerocount; i<n; i++){
            if(nums[i] != 0)  swap++;
        }
        return swap;
    }
}