class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        while(n != 1){
            if(n % 2 == 0 ){
                n = n/2;
            }
            else{
                return false;
            }
        }
        return true;

//OR 
        if(n<=0){
            return false;
        }
        while(n>=1){
            if(n%2 !=0){
                return false;
            }
            n = n/2;
        }
        return true;
    }
}
