class Solution {
    public boolean isPalindrome(String s) {
           return check(s , 0 , s.length()-1);
    }
    public static boolean check(String s , int i , int j){
        if(i >= j){
            return true;
        }
        char left = s.charAt(i);
        char right = s.charAt(j);

        if(!Character.isLetterOrDigit(left)){
             return check(s , i +1 , j);
        }
        if(!Character.isLetterOrDigit(right)){
            return check(s , i , j-1);
        }
        if(Character.toLowerCase(left) != Character.toLowerCase(right)){
            return false;
        }
        return check(s , i+1 , j-1);
    }
}