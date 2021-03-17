public class LPSBottomUp {
    public static int LPSBU(String str){
        int n = str.length();
        int[][] strg = new int[n][n];
        for(int slide = 0; slide <= n-1; slide++){
            for(int si = 0; si <= n-slide-1; si++){
                int ei = si + slide;
                if(si == ei){
                    strg[si][ei] = 1;
                }
                else{
                    int ans = 0;
                    if(str.charAt(si) == str.charAt(ei)){
                        ans = strg[si+1][ei-1] + 2;
                    }
                    else{
                        int op1 = strg[si+1][ei];
                        int op2 = strg[si][ei-1];
                        ans = Math.max(op1, op2);
                    }
                    strg[si][ei] = ans;
                }
            }
        }
        return strg[0][n-1];
    }

    public static void main(String[] args) {
        String str = "acdgca";
        System.out.println(LPSBU(str)); 
    }
}

//Output: 5