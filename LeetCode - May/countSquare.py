class Solution:
    def countSquares(self, matrix: List[List[int]]) -> int:
        count = 0
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if(i is not 0 and j is not 0 and matrix[i][j] is not 0):
                    matrix[i][j] = min(matrix[i-1][j-1],min(matrix[i-1][j],matrix[i][j-1]))+1
                count=count+matrix[i][j]
        return count;