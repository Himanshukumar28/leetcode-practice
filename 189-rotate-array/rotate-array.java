class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];
        k = k % n;
        int j = 0;  //index of res
        for(int i = n-k; i<n; i++){
            res[j] = nums[i];
            j++;
        }
        for(int i = 0; i<n-k; i++){
            res[j] = nums[i];
            j++;
        }
        //copy all the values of res to nums
        for(int i = 0; i<n; i++){
            nums[i] = res[i];
        }
    }
}