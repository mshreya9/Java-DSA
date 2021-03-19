import java.util.Arrays;

public class KOrderedLCSTopDown {
    public static int KOrderedLCSTD(String s1, String s2, int k, int vidx1, int vidx2, int[][][] strg){
        //Base Case
        if(s1.length() == vidx1 || s2.length() == vidx2){
            return 0;
        }

        if(strg[k][vidx1][vidx2] != -1){
            return strg[k][vidx1][vidx2];
        }

        int ans = 0;
        if(s1.charAt(vidx1) == s2.charAt(vidx2)){
            ans = KOrderedLCSTD(s1, s2, k, vidx1+1, vidx2+1, strg) + 1;
        }
        else{
            int op1 = KOrderedLCSTD(s1, s2, k, vidx1, vidx2+1, strg);
            int op2 = KOrderedLCSTD(s1, s2, k, vidx1+1, vidx2, strg);
            int op3 = 0;
            if(k >= 1){
                op3 = KOrderedLCSTD(s1, s2, k-1, vidx1+1, vidx2+1, strg) + 1;
            }

            ans = Math.max(op1, Math.max(op2, op3));
        }

        strg[k][vidx1][vidx2] = ans;
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "agcfd";
        int k = 1;
        int[][][] strg = new int[k+1][s1.length()+1][s2.length()+1];
        for(int i = 0; i < strg.length; i++){
            for(int j = 0; j < strg[0].length; j++){
                Arrays.fill(strg[i][j], -1);
            }
        }
        System.out.println(KOrderedLCSTD(s1, s2, k, 0, 0, strg));
    }
}

//Output: 4