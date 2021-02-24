class Solution {
    public int uniquePaths(int m, int n) {
        //Bottom Up DP Code
        int[][] strg = new int[m+1][n+1];
        for(int row = m-1; row >= 0; row--){
            for(int col = n-1; col >= 0; col--){
                if(row == m-1 && col == n-1){
                    strg[row][col] = 1;
                }
                else{
                    strg[row][col] = strg[row][col+1]  + strg[row+1][col];
                }
            }
        }
        return strg[0][0];
    }
}