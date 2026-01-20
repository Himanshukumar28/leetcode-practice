class Solution {
    public int differenceOfSums(int n, int m) {
        int nd = 0;
        int d = 0;
        for(int i=1; i<=n; i++){
            if(i%m ==0){
                d= d+i;
        }
          else{
                nd = nd + i;
                }
            }
            return nd-d;
    }
}