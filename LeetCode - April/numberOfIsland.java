class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
		
        int numIslands=0;
		
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == '1'){
                    numIslands +=dfs(grid, i, j);
                }
            }
        }
        return numIslands;
    }
    
    int dfs(char[][] array, int i, int j){
        if(i<0 || i>=array.length || j<0 || j>=array[i].length || array[i][j]=='0') return 0;
        
        array[i][j]='0'; 
        
        dfs(array, i+1, j); 
        dfs(array, i-1, j);
        dfs(array, i, j+1);  
        dfs(array, i,j-1);  
        return 1;
    }
}
