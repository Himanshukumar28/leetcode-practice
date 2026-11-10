
class Solution {
    public int[] findColumnWidth(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int[] ans = new int[cols];

        for (int j = 0; j < cols; j++) {

            int max = 0;

            for (int i = 0; i < rows; i++) {

                int len = String.valueOf(grid[i][j]).length();

                max = Math.max(max, len);
            }

            ans[j] = max;
        }

        return ans;
    }
}
