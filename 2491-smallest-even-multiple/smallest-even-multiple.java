class Solution {
    public int smallestEvenMultiple(int n) {
        int sint = 0;
        for(int i = n; i>=n; i++){
            if(i%n==0 && i%2==0){
                sint = sint + i;
                break;
            }
        }
        return sint;
    }
}