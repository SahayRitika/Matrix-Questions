class Solution {
    public long maxMatrixSum(int[][] matrix) {
       int n= matrix.length;//row
       int m= matrix[0].length;//col

       int min= Integer.MAX_VALUE;
       int noOfNegatives=0;
       long sum=0;

       for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            //if negative
            if(matrix[i][j]<0){
                noOfNegatives++;
            }
            min= Math.min(min, Math.abs(matrix[i][j]));
            sum+= Math.abs(matrix[i][j]);
        }
       }

       if(noOfNegatives%2 !=0){
        sum-= min;
        sum-= min;
       }

       return sum;
    }
}
