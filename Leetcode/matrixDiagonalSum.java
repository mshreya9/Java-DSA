class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int middle = 0;
        for(int i = 0; i < mat.length; i++){
            middle = mat[mat.length/2][mat.length/2];
            sum += mat[i][i];
            sum += mat[i][mat.length-1-i];
        }
        
        if(mat.length % 2 != 0){
            return sum - middle;
        }
        else{
            return sum;
        }
    }
}