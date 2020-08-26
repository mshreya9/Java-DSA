class Solution {
    public static int repeatSub(String a, String b, int n){
        int[][] t = new int[n+1][n+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < n+1; j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < n+1; j++){
                if(a.charAt(i-1) == b.charAt(j-1) && i != j){
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
        return t[n][n];
    }
    public static void main(String[] args) {
        String s = "AABEBCDD";
        int n = s.length();
        String a = s;
        String b = s;
        System.out.println(repeatSub(a, b, n));
    }
}

//Output: 3 (ABD)