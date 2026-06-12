class Solution {
    public int countDigits(int num) {
        int count = 0;
        for(int dummy = num; dummy>0; dummy /= 10){
            int val = dummy % 10;
            if(num % val == 0){
                count++;
            }
        }
        return count;
    }
}