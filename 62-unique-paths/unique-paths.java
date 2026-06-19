class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        return count(1,1,m,n,dp);
    }
    public static int count(int sr, int sc, int er, int ec, int[][] dp){
        if(sr > er || sc > ec) return 0;
        if(sr == er || sc == ec) return 1;
        if(dp[sr][sc] != 0) return dp[sr][sc];

        //Right
        int right = count(sr , sc+1 , er , ec , dp);
        //Left
        int left = count(sr+1 , sc , er , ec, dp);
        return dp[sr][sc] =  right + left;
    }
}