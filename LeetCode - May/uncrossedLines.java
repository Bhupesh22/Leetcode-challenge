class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int la = A.length;
        int lb = B.length;
        
        int[][] dp = new int [la+1][lb+1];
        
        for(int i=1; i<la+1; i++){
            for(int j=1; j<lb+1; j++){
                if(A[i-1]==B[j-1])
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[la][lb];
    }
}