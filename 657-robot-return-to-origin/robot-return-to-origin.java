class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int ch1 = 0;
        int ch2 = 0;
        for(int i = 0; i<n; i++){
            char ch = moves.charAt(i);
            if(ch == 'R') ch1++;
            if(ch == 'L') ch1--;
            if(ch == 'U') ch2++;
            if(ch == 'D') ch2--;

        }
        if(ch1 == 0 && ch2 == 0) return true;
        else return false;
    }
}