class Solution {
    public int maxMoves(int[][] grid) {
        int n= grid.length;//row
        int m=grid[0].length;//cols

        int[][] dp= new int[n][m];
        int maxMove=0, currMax=0;

        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                if(j <m-1){
                    if(grid[i][j+1] > grid[i][j]){
                        dp[i][j+1]= Math.max(dp[i][j+1], dp[i][j]+1);
                        currMax= Math.max(dp[i][j+1], currMax);
                    }
                }
                if(i < n-1 && j<m-1){
                    if(grid[i+1][j+1] > grid[i][j]){
                        dp[i+1][j+1]= Math.max(dp[i+1][j+1], dp[i][j]+1);
                        currMax=Math.max(dp[i+1][j+1], currMax);
                    }
                } 
                if(i>0 && j< m-1){
                    if(grid[i-1][j+1] > grid[i][j]){
                        dp[i-1][j+1]= Math.max(dp[i-1][j+1], dp[i][j]+1);
                        currMax= Math.max(dp[i-1][j+1], currMax);
                    }
                }
            }
            if(currMax== maxMove){
                return currMax;
            }
            maxMove= currMax;
            //if(maxMove==0) return 0;
        }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        return maxMove;
    }
}
