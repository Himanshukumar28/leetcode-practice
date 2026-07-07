class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //0 1 2 
        //2 3 7 , target = 10;
        //i      start to end
        //{2value : 0index ,3: 1 }
        //{2 , 0} index
        //T:O(n)  ,  S:O(n);
        for(int i =0; i<nums.length; i++){
            int lookingFor = target - nums[i];
            if(map.containsKey(lookingFor)){
                return new int[] {i , map.get(lookingFor)};
            }
            map.put(nums[i] , i);
        }
        return new int[] { -1 , 1};  // not run 
        
    }
}