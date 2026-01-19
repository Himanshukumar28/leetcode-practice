class Solution {
    public int mirrorDistance(int n) {
       // int i = 0;
        long rev = 0;
        int N = n;
        while(n>0){
            int rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        return (int)Math.abs(N - rev);
    }
}