class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int []arr: matrix){
            for(int val: arr){
                if(val== target){
                    return true;
                }
            }
        }
        return false;
    }
}
//more optimised
