class Solution {
    public int subtractProductAndSum(int n) {
        int digit = 0;
        int sum = 0;
        int multi = 1;

        while(n>0){
            digit = n%10;
            multi = multi*digit;
            sum = sum + digit;
            n = n/10;
        }
        int result = multi -sum;
        return result;
    }
}