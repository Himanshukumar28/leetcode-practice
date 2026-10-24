class Solution {
    public void dfs(int[][] image , int r , int c , int original , int color){
        if(r < 0 || r >= image.length || c < 0 || c >= image[0].length){
            return;
        }
        //only fill original color
        if(image[r][c] != original){
            return;
        }
        //change color
        image[r][c] = color;

        //up
        dfs(image , r -1 , c , original , color);
        //down
        dfs(image , r + 1 , c , original , color);
        //left
        dfs(image , r , c -1 , original , color);
        //right
        dfs(image , r , c + 1 , original , color);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];

        if(original == color) return image;

        dfs(image , sr , sc , original , color);

        return image;

    }
}