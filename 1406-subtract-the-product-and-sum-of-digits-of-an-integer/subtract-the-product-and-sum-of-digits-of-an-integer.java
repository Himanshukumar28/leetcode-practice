class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int pro = 1;
        while(n>=1){
            sum = n % 10 + sum;
            pro = n % 10 * pro;
            n = n /10;
        }
        return pro - sum;
    }
}