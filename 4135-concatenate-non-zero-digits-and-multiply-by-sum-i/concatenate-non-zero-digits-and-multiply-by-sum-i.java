class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long rev = 0;
        while(n > 0){
           if(n % 10 !=0){
            rev = rev * 10 + n % 10;
           } 
            sum = sum + n % 10;
            n  = n/10;
        }
        long rev1 = 0;
        while(rev > 0){
            rev1 = rev1 * 10 + rev %  10;
            rev = rev/10;
        }
        return rev1*sum; 

    }
}