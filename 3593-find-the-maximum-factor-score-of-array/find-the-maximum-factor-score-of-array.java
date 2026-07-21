class Solution {
    public long gcd(long a , long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long lcm(long a , long b){
        return a / gcd(a,b) * b;
    }

    public long maxScore(int[] nums) {
        int n = nums.length;
        long ans = 0;

        for(int remove = -1; remove<n; remove++){
            long g = 0;
            long l = 1;
            boolean first = true;

            for(int i = 0; i<n; i++){
                if(i == remove) continue;

                if(first){
                    g = nums[i];
                    l = nums[i];
                    first = false;
                }else{
                    g = gcd(g, nums[i]);
                    l = lcm(l , nums[i]);
                }
            }

            // If all elements were removed (n == 1)
            if(first){
                ans = Math.max(ans , 0);
            }else{
                ans = Math.max(ans , g*l);
            }
        }
        return ans;
        }
    }