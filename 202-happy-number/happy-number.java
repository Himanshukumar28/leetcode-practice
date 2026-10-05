class Solution {
    public int sumofsquersofdigit(int n){
        int sum = 0;
        while(n != 0){
            int digits = n %10;
            n = n /10;
            sum = sum + (digits * digits);
        }
        return sum;
    }
    public boolean isHappy(int n) {
        //floyd cycle detection algo
        int slow = n;
        int fast = n;

        while(true){
            slow = sumofsquersofdigit(slow);
            fast = sumofsquersofdigit(sumofsquersofdigit(fast));

            if(fast == 1) return true;
            if(slow == fast) return false;
        }
    }
}
//T.C- 0(log n);
//S.C- 0(1);