class Solution {
    public int numSpecial(int[][] mat) {
        int nr = mat.length;
        int nc = mat[0].length;
        int[] row = new int[nr];
        int[] col = new int[nc];
        int ans = 0;
        for(int i = 0; i < nr; i++){
            for(int j = 0; j < nc; j++){
                row[i] += mat[i][j];
                col[j] += mat[i][j];
            }
        }

        for(int i = 0; i < nr; i++){
            for(int j = 0; j < nc; j++){
                if(mat[i][j] == 1){
                    if(mat[i][j] == 1 && row[i] == 1 && col[j] == 1) 
                        ans++;
                }
            }
        }
        return ans;
    }
}
