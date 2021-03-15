public class LCSTopDown {
    public static int LCSTD(String s1, String s2, int vidx1, int vidx2, int[][] strg){
        if(s1.length() == vidx1 || s2.length() == vidx2){
            return 0;
        }

        if(strg[vidx1][vidx2] != 0){ //re use
            return strg[vidx1][vidx2];
        }

        char ch1 = s1.charAt(vidx1);
        char ch2 = s2.charAt(vidx2);

        int ans = 0;

        if(ch1 == ch2){
            ans = LCSTD(s1, s2, vidx1+1, vidx2+1, strg) + 1;
        }
        else{
            int op1 = LCSTD(s1, s2, vidx1, vidx2+1, strg);
            int op2 = LCSTD(s1, s2, vidx1+1, vidx2, strg);
            ans = Math.max(op1, op2);
        }

        strg[vidx1][vidx2] = ans;
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "agcfd";
        int[][] strg = new int[s1.length()][s2.length()];
        System.out.println(LCSTD(s1, s2, 0, 0, strg));
    }
}

//Output: 3

//TC: O(m*n)
//SC: O(m*n) + Recursion extra space