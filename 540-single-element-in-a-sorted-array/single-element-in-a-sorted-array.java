class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n-1;
                while (st < end) {
            int mid = st + (end - st) / 2;
            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                // Pair is correct, single is on the right
                st = mid + 2;
            } else {
                // Pair is broken, single is on the left
                end = mid;
            }
        }

        return nums[st];
    }
}