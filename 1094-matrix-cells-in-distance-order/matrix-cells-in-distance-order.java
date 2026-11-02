class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
         // Total number of cells
        int[][] ans = new int[rows * cols][2];
        int k = 0;

        // 1. Store every cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[k][0] = i;  // row
                ans[k][1] = j;  // column
                k++;
            }
        }
        // 2. Sort cells according to distance
        Arrays.sort(ans, (a, b) -> {

            int distA = Math.abs(a[0] - rCenter)
                      + Math.abs(a[1] - cCenter);

            int distB = Math.abs(b[0] - rCenter)
                      + Math.abs(b[1] - cCenter);

            return distA - distB;
        });

        return ans;
    }
}