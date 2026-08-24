class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++) dp[0][i]=grid[0][i];
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int prev=Integer.MAX_VALUE;
                for(int k=0;k<n;k++){
                    if(k!=j){
                    prev  =Math.min(prev,dp[i-1][k]);
                    }
                }
                dp[i][j]= grid[i][j]+prev;
            }
        }
        int res=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            res =Math.min(res,dp[n-1][j]);
        }
        return res;
    }
}