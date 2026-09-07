class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();

        for(int i =0; i<n; i++){
            if(i ==0 || nums[i] != nums[i-1]){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }

        int answer = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                answer++;
            }
        }
        return answer;
    }
}
