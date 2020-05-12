class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid: 
            return 0
        rows , cols , numberOfIslands = len(grid) , len(grid[0]) , 0
        
        def findIsland(grid , x , y):
            if x < 0 or x >=rows or y < 0 or y >= cols or grid[x][y] == "0":
                return 0
            grid[x][y] = "0"
            findIsland(grid , x + 1 , y)
            findIsland(grid , x - 1 , y)
            findIsland(grid , x , y + 1)
            findIsland(grid , x , y - 1)
            return 1
        
        for i in range(rows):
            for j in range(cols):
                if grid[i][j] == "1":
                    numberOfIslands += findIsland(grid , i , j)
        return numberOfIslands