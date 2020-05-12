class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            int img = image[sr][sc];
            if (img != newColor) 
                floodFill(image, sr, sc, img, newColor);
            return image;
    }
    public void floodFill(int[][] image, int row, int col, int img, int newColor) {
       if(row < 0 || col < 0 || row>= image.length || col>= image[0].length || image[row][col] == newColor)
            return;
        
        if(image[row][col] == img){
            image[row][col] = newColor;
            floodFill(image, row+1, col, img, newColor);
            floodFill(image, row-1, col, img, newColor);
            floodFill(image, row, col+1, img, newColor);
            floodFill(image, row, col-1, img, newColor);
        }
    }
    
}