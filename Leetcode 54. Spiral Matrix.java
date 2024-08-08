class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans= new ArrayList<>();
        int n=matrix.length;//row
        int m=matrix[0].length;//col
        int i=0, j=m-1, k=n-1, l=0;
        while(ans.size()<(n*m)){
            //row(forward)
            for(int c=i; c<=j; c++){
                ans.add(matrix[i][c]);
            }
            i++;
            //col(downward)
            for(int c=i; c<=k; c++){
                ans.add(matrix[c][j]);
            }
            j--;
            System.out.println(ans);
            if(ans.size()>=(n*m)){
                break;
            }
            //row(backward)
            for(int c=j; c>=l; c--){
                ans.add(matrix[k][c]);
            }
            k--;
            //col(upward)
            for(int c=k ; c>=i; c--){
                ans.add(matrix[c][l]);
            }
            l++;
        }
        return ans;
    }
}
