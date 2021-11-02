class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = matrixGenerate(n);
        int[][] ans = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans[i][j] = matrix[i][j];
            }
        }
        return ans;
    }
    
    private int[][] matrixGenerate(int n){
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[top].length-1;
        int count = (bottom+1)*(right+1);
        int dir = 1;
        
        while(left <= right && top <= bottom){
            if(count > 0){
                if(dir == 1){
                    for(int i = left; i <= right; i++){
                        matrix[top][i] = num;
                        num++;
                        count--;
                    }
                    dir = 2;
                    top++;
                }
            }

            if(count > 0){
                if(dir == 2){
                    for(int i = top; i <= bottom; i++){
                        matrix[i][right] = num;
                        num++;
                        count--;
                    }
                    dir = 3;
                    right--;
                }
            }

            if(count > 0){
                if(dir == 3){
                    for(int i = right; i >= left; i--){
                        matrix[bottom][i] = num;
                        num++;
                        count--;
                    }
                    dir = 4;
                    bottom--;
                }
            }

            if(count > 0){
                if(dir == 4){
                    for(int i = bottom; i >= top; i--){
                        matrix[i][left] = num;
                        num++;
                        count--;
                    }
                    dir = 1;
                    left++;
                }
            }
        }
        
        return matrix;
    }
}