class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int k = 0;
        while(k <= j){
            if(nums[k] == 1){
                k++; 
            }
            else if(nums[k] == 2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                 j--;
            }
            else {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;

                i++;
                k++;
            }
        }
    }
}
//         [2 , 0 , 2 , 1 , 1 , 0]
        //  i                 
        //                      j
        //  k
        // [0 , 0 , 1 , 1 , 2 , 2]
        //          i
        //              j
        //                  k
        //T: O(n) , S: O(1)