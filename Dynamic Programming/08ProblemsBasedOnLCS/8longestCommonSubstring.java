class Solution {
    public static int LCSWithDP(String X, String Y, int n, int m){
        int[][] t = new int[n+1][m+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < m+1; j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(X.charAt(i-1) == Y.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                    if(t[i][j] > max){
                        max = t[i][j];
                    }
                }
                else{
                    t[i][j] = 0;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String X = "abcde";
        String Y = "abfce";
        System.out.println(LCSWithDP(X, Y, X.length(), Y.length()));
    }
}

//Output: 2