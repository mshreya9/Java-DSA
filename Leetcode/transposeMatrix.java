class Solution {
    public int[][] transpose(int[][] A) {
        int[][] arr = new int[A[0].length][A.length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                arr[j][i] = A[i][j];
            }
        }
        return arr;
    }
}