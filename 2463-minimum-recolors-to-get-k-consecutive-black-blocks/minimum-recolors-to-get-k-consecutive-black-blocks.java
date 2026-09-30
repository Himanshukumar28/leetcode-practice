class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white = 0;

        for(int i = 0; i<k; i++){
            if(blocks.charAt(i) == 'W'){
                white++;
            }
        }
        int minWhite = white;

        for(int i =k; i<blocks.length(); i++){
            // Remove left character
            if(blocks.charAt(i - k) == 'W'){
                white--;
            }
            // Add new right character
            if(blocks.charAt(i) == 'W'){
                white++;
            }
            minWhite = Math.min(minWhite , white);
        }
        return minWhite;
    }
}