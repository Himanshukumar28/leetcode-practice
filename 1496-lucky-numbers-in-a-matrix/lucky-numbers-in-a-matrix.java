class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        //Find minimum of each row
        for(int i = 0; i<rows; i++){
            int rowMin = Integer.MAX_VALUE;
            int minCol = 0;

            for(int j = 0; j<cols; j++){
                if(matrix[i][j] < rowMin){
                    rowMin = matrix[i][j];
                    minCol = j;
                }
            }
            // Check if row minimum is maximum in its column
            boolean lucky = true;
            for(int k = 0; k<rows; k++){
                if(matrix[k][minCol] > rowMin){
                    lucky = false;
                    break;
                }
            }
            if(lucky){
                ans.add(rowMin);
            }
        }
        return ans;
    }
}