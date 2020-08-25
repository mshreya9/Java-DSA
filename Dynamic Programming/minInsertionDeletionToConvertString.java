//Question: Minimum # of insertions and deletions required to convert String X to String Y 

class Solution {
    public static void LCS(String X, String Y, int n, int m){
        int[][] t = new int[n+1][m+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < m+1; j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(X.charAt(i-1) == Y.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
        int ndel = n -  t[n][m];
        int nins = m -  t[n][m];
        System.out.println(nins + " " + ndel);
        
    }
    public static void main(String[] args) {
        String X = "heap";
        String Y = "pea";
        LCS(X, Y, X.length(), Y.length());
    }
}

//Output format : (# of insertions) (# of deletions)

//Output: 1 2 