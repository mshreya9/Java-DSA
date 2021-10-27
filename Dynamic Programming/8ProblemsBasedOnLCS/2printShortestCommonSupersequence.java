class Solution {
    public static String PrintLCS(String X, String Y, int n, int m){
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

        StringBuilder sb = new StringBuilder();
        int i = n, j = m;
        while(i > 0 && j > 0){
            if(X.charAt(i-1) == Y.charAt(j-1)){
                sb.append(X.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(t[i][j-1] > t[i-1][j]){
                    sb.append(Y.charAt(j-1));
                    j--;
                }
                else{
                    sb.append(X.charAt(i-1));
                    i--;
                }
            }
        }

        //Any one of the below two loops would run because either i == 0 or j == 0

        //if j == 0
        while(i > 0){
            sb.append(X.charAt(i-1));
            i--;
        }

        //if i == 0
        while(j > 0){
            sb.append(Y.charAt(j-1));
            j--;
        }

        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        String X = "acbcaf";
        String Y = "abcdaf";
        System.out.println(PrintLCS(X, Y, X.length(), Y.length()));
    }
}

//Output: acbcdaf