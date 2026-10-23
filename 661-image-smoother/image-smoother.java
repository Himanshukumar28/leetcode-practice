class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;

        int[][] result = new int[m][n];

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                int sum = 0;
                int count = 0;

                //check all 8 neighbour + current cell
                for(int di = -1; di<=1; di++){
                    for(int dj = -1; dj<=1; dj++){

                        int ni = i + di;
                        int nj = j + dj;

                        //check boundaries
                        if(ni >=0 && ni <m && nj >=0 && nj <n){
                            sum = sum + img[ni][nj];
                            count++;
                        }
                    }
                }
                result[i][j] = sum / count;
            }
        }
        return result;
    }
}