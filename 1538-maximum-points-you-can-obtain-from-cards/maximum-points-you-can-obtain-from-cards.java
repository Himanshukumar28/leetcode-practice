class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum = 0;
        int max = Integer.MIN_VALUE;
        //Precompute
        for(int i = 0; i<k; i++){
            lsum = lsum + cardPoints[i];
        }
        max = lsum;
        int rsum  = 0;
        int li = n-1;
        for(int i = k-1; i>=0; i--){
            //Shrink
            lsum = lsum - cardPoints[i];
            //Expaind
            rsum = rsum + cardPoints[li];
            li--;
            max = Math.max(max,lsum+rsum);
        }
        return max;
    }
}