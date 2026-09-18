class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for(int i =0; i<n; i++){
            //FOR ODD
            int low = i;
            int high = i;
            while(low >= 0 && high <n && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                count++;
            }
            //FOR EVEN
            low = i;
            high = i+1;
            while(low >= 0 && high <n && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                count++;
            }
        }
        return count;
    }
}