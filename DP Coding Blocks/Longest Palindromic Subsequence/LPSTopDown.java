public class LPSTopDown {
    public static int LPSTD(String str, int si, int ei, int[][] strg){
        //Base Case
        if(si == ei){
            return 1;
        }

        if(strg[si][ei] != 0){
            return strg[si][ei];
        }

        int ans = 0;
        if(str.charAt(si) == str.charAt(ei)){
            ans = LPSTD(str, si+1, ei-1, strg) + 2;
        }
        else{
            int op1 = LPSTD(str, si+1, ei, strg);
            int op2 = LPSTD(str, si, ei-1, strg);
            ans = Math.max(op1, op2);
        }

        strg[si][ei] = ans;
        return ans;
    }

    public static void main(String[] args) {
        String str = "acdgca";
        int[][] strg = new int[str.length()][str.length()];
        int si = 0;
        int ei = str.length()-1;
        System.out.println(LPSTD(str, si, ei, strg)); 
    }
}

//Output: 5