class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] maxCol = new int[col];
        //find max
        for(int j = 0; j<col; j++){
             maxCol[j] = Integer.MIN_VALUE;
             for(int i =0; i<row; i++){
                maxCol[j] = Math.max(maxCol[j] , matrix[i][j]);
             }
        }
        
        //replace -1
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = maxCol[j];
                }
            }
        }
        return matrix;
    }
}