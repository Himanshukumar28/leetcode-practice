class Solution {
    public int countElements(int[] nums, int k) {
        if(k == 0) return nums.length;
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        int ul = nums[n-k];
        for(int i = 0; i<n; i++){
            if(nums[i] < ul){
                count++;
            }
        }
        return count;
    }
}
// Kitna elment hai arr mein jo k element se chote hai
//arr[n-k] se chote values will be the ans