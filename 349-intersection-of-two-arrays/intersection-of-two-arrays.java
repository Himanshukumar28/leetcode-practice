class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> interSection = new HashSet<>();

        for(int nums : nums1){
            set.add(nums);
        }

        for(int nums : nums2) {
            if(set.contains(nums)){
                interSection.add(nums);
            }
        }
        int[] ans = new int[interSection.size()];
        int index = 0;

        for(int nums : interSection){
            ans[index] = nums;
            index++;
        }
        return ans;
    }
}