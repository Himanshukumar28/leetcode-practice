class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int i = k;
        for(int j = k; j<nums.length; j++){
            if(nums[j] != nums[i-k]){
                nums[i] = nums[j];
                i++;
            }

        }
        return Arrays.copyOf(nums, i);
    }
}