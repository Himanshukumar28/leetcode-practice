class Solution {
    public boolean isPrime(int num){
        if(num<2) return false;

        for(int i = 2; i*i <= num; i++){
            if(num% i == 0)return false;
        }
        return true;
    }
    public boolean completePrime(int num) {
        String s =  String.valueOf(num);
        int n = s.length();
        //check prefixes
        int prefix = 0;
        for(int i = 0; i<n; i++){
            prefix = prefix * 10 + (s.charAt(i) - '0');
            if(!isPrime(prefix)) return false;
        }
        
        //check suffixes
        for(int i =0; i<n; i++){
            int suffixes = Integer.parseInt(s.substring(i));
            if(!isPrime(suffixes)) return false;
        }    
        
        return true;
    }
}