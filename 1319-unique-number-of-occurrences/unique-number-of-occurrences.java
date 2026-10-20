class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer , Integer> map = new HashMap<>();
        // Store frequency of each number
        for(int nums : arr){
            map.put(nums, map.getOrDefault(nums , 0) + 1);
        }
         // Store frequencies we've already seen
        Set<Integer> set = new HashSet<>();
        for(int frequence : map.values()){
            // If this frequency already exists,
            // occurrences are not unique
            if(set.contains(frequence)){
                return false;
            }
            set.add(frequence);
        }
        return true;
    }
}