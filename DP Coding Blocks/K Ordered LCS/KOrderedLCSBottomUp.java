public class KOrderedLCSBottomUp {
    public static int KOrderedLCSBU(String s1, String s2, int tk) {
        int[][][] strg = new int[tk+1][s1.length()+1][s2.length()+1];
        for(int k = 0; k <= tk; k++){
            for(int row = s1.length()-1; row >= 0; row--){
                for(int col = s2.length()-1; col >= 0; col--){
                    int ans = 0;
                    if(s1.charAt(row) == s2.charAt(col)){
                        ans = strg[k][row+1][col+1] + 1;
                    }
                    else{
                        int op1 = strg[k][row][col+1];
                        int op2 = strg[k][row+1][col];
                        int op3 = 0;
                        if(k >= 1){
                            op3 = strg[k-1][row+1][col+1] + 1;
                        }
                        ans = Math.max(op1, Math.max(op2, op3));
                    }
                    strg[k][row][col] = ans;
                }
            }
        }
        return strg[tk][0][0];
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "agcfd";
        int k = 1;
        System.out.println(KOrderedLCSBU(s1, s2, k));
    }
}

//Output: 4