class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
    //  1 2 4 2 1
    // 0 ^ 4 = 4
        for(int num : nums){
            res = res ^ num;
        }
        return res;
    }
}