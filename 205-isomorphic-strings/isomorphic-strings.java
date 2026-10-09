class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character , Character> sTOt = new HashMap<>();
        Map<Character , Character> tTOs = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char _s = s.charAt(i);
            char _t = t.charAt(i);
            if(!sTOt.containsKey(_s) && !tTOs.containsKey(_t)){
                sTOt.put(_s , _t);
                tTOs.put(_t , _s);
            }
            else if(sTOt.get(_s) == null){
                return false;
            }
            else if(tTOs.get(_t) == null){
                return false;
            }
            else if(sTOt.get(_s) != _t && tTOs.get(_t) != _s){
                return false;
            }
        }
        return true;
    }
}