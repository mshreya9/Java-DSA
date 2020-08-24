class Solution {
    public static int LCS(String X, String Y, int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }
        if(X.charAt(n-1) == Y.charAt(m-1)){
            return 1 + LCS(X, Y , n-1, m-1);
        }
        else{
            return Math.max(LCS(X, Y, n, m-1), LCS(X, Y, n-1, m));
        }
    }
    public static void main(String[] args) {
        String X = "abcdgh";
        String Y = "abedfhr";
        int n = X.length();
        int m = Y.length();
        System.out.println(LCS(X, Y, n, m)); 
    }
}

//Output: 4 (abdh)