class Solution {
    public static int LCSWithMemoization(String X, String Y, int n, int m){
        //According to contraints given in question
        int[][] t = new int[1001][1001];
        for(int i = 0; i < 1001; i++){
            for(int j = 0; j < 1001; j++){
                t[i][j] = -1;
            }
        }
        if(n == 0 || m == 0){
            return 0;
        }
        
        if(t[n][m] != -1){
            return t[n][m];
        }

        if(X.charAt(n-1) == Y.charAt(m-1)){
            t[n][m] = 1 + LCSWithMemoization(X, Y , n-1, m-1);
            return t[n][m];
        }
        else{
            t[n][m] = Math.max(LCSWithMemoization(X, Y, n, m-1), LCSWithMemoization(X, Y, n-1, m));
            return t[n][m];
        }

    }
    public static void main(String[] args) {
        String X = "abcdgh";
        String Y = "abedfhr";
        System.out.println(LCSWithMemoization(X, Y, X.length(), Y.length())); 
    }
}