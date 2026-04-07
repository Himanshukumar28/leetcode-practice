class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i<n; i++){
            char ch = moves.charAt(i);
            if(ch == 'R') c1++;
            if(ch == 'L') c1--;
            if(ch == 'U') c2++;
            if(ch == 'D') c2--;
        }
        if(c1 == 0 && c2 == 0) return true;
        else return false;
    }
}