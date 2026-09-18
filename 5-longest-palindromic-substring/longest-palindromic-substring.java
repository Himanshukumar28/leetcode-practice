class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        for(int i = 0; i<n; i++){
            //FOR ODD
            int low = i;
            int high = i;
            while(low >= 0 && high <n && s.charAt(low) == s.charAt(high)){
                low--;
                high++;
            }
            String curr = s.substring(low+1 , high);
            if(curr.length() > res.length()){
                res = curr;
            }
            //FOR EVEN
            int low1 = i;
            int high1 = i+1;
            while(low1 >=0 && high1 <n && s.charAt(low1) == s.charAt(high1)){
                low1--;
                high1++;
            }
            String curr1 = s.substring(low1+1 , high1);
            if(curr1.length() > res.length()){
                res = curr1;
            }
        }
        return res;
    }
}