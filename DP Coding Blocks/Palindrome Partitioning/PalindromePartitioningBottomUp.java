public class PalindromePartitioningBottomUp {
    public static int PPBU(String s) {
        //Bottom Up DP Code
        int[][] strg = new int[s.length()][s.length()];
        int n = s.length();
        for(int slide = 0; slide <= n-1; slide++){
            for(int si = 0; si <= n-slide-1; si++){
                int ei = si + slide;

                if(isPalindrome(s,si,ei)){
                    strg[si][ei] = 0;
                }
                else{
                    int min = Integer.MAX_VALUE;
                    for(int k = si; k <= ei-1; k++){
                        int fp = strg[si][k];
                        int sp = strg[k+1][ei];
                        int total = fp + sp + 1;
                        if(total < min){
                            min = total;
                        }
                    }
                    strg[si][ei] = min;
                }
            }
        }
        return strg[0][n-1];
    }

    public static boolean isPalindrome(String s, int si, int ei){
        int l = si;
        int r = ei;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abacd";
        System.out.println(PPBU(s));
    }
}

//Output: 2
