class Solution {
    public boolean isThree(int n) {
        int cout = 0;
        for(int i =1; i<=n; i++){
            if(n%i ==0){
                cout++;
            }
        }
        if(cout==3){
            return true;
        }
        else{
            return false;
        }
    }
}