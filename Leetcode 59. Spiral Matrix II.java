class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][]= new int[n][n];
        int i=0, j=n-1, k=n-1, l=0,num=1;
        while(num<=(n*n)){
            //row(forward)
            for(int c=i; c<=j; c++){
                ans[i][c]=num++;
            }
            i++;
            //col(downward)
            for(int c=i; c<=k; c++){
                ans[c][j]=num++;
            }
            j--;
            if(num>(n*n)){
                break;
            }
            //row(backward)
            for(int c=j; c>=l; c--){
                ans[k][c]=num++;
            }
            k--;
            //col(upward)
            for(int c=k ; c>=i; c--){
                ans[c][l]=num++;
            }
            l++;
        }
        return ans;
    }
}
