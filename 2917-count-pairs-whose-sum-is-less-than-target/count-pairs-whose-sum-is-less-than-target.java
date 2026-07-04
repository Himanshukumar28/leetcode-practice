class Solution {
    public int countPairs(List<Integer> nums, int target) {
        //T: O(n logn)
        //S: O(logn)
        Collections.sort(nums);
        int i = 0;
        int j = nums.size() - 1;
        int count = 0;
        // -1 1 2 3 1 , 2
        //  0 1 2 3 4   index
        // -1 1 1 2 3  sort
        //  i
        //          j
        // count 2
        while (i < j) {
            int sum = nums.get(i) + nums.get(j);
            if (sum < target) {
                count = count + (j - i);
                i++;
            } else
                j--;
        }
        return count;
    }
}