class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] ans = new int[m];
        for(int i = 0; i<m; i++){
            int index = -1;
            // Find nums1[i] in nums2
            for(int j  =0; j<n; j++){
                if(nums2[j] == nums1[i]){
                     index = j;
                     break;
                }
            }
            //find next greater element
            ans[i] = -1;  
            for(int j = index + 1; j<n; j++){
                if(nums2[j] > nums1[i]){
                    ans[i] = nums2[j];
                    break;
                }
            }
        } 
        return ans;
    }
}