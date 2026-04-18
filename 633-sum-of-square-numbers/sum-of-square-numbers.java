class Solution {
    public boolean judgeSquareSum(int c) {
        //BINARY SEARCH
        // for(long a=0;a*a<=c;a++){
        //     double b = Math.sqrt(c-a*a);
        //         if(b==(int)b){
        //             return true;
        //         }
        // }
        // return false;

        // for(long a =0; a*a<=c; a++){
        //     for(long b =0; b*b<=c; b++){
        //         if(a*a + b*b == c) return true;
        //     }
        // }
        // return false;  c= 2147483646

        for(long a = 0; a*a <= c; a++){
            double b = Math.sqrt(c-a*a);

            if(b == (int)b) return true;
        } 
        return false;
    }
}