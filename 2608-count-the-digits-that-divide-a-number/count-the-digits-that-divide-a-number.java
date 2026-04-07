class Solution {
    public int countDigits(int num) {
        int count = 0; 
        for(int dummy = num; dummy>0; dummy /= 10){
            int digit = dummy % 10;
            if(num % digit == 0){
                count++;
            }
        }
        return count;
    }
}