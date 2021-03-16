import java.util.*;

public class EditDistanceTopDown {
    public static int EDTD(String s1, String s2, int vidx1, int vidx2, int[][] strg){
        //Base Case
        if(s1.length() == vidx1 || s2.length() == vidx2){
            return Math.max(s1.length()-vidx1, s2.length()-vidx2);
        }

        if(strg[vidx1][vidx2] != -1){ //re use
            return strg[vidx1][vidx2];
        }

        char ch1 = s1.charAt(vidx1);
        char ch2 = s2.charAt(vidx2);
        int ans = 0;
        if(ch1 == ch2){
            ans = EDTD(s1, s2, vidx1+1, vidx2+1, strg);
        }
        else{
            int i = EDTD(s1, s2, vidx1+1, vidx2, strg);
            int d = EDTD(s1, s2, vidx1, vidx2+1, strg);
            int r = EDTD(s1, s2, vidx1+1, vidx2+1, strg);

            ans = Math.min(i, Math.min(d,r)) + 1;
        }

        strg[vidx1][vidx2] = ans;
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "agcfd";

        int[][] strg = new int[s1.length()][s2.length()];
        for(int i = 0; i < strg.length; i++){
            Arrays.fill(strg[i], -1);
        } 

        System.out.println(EDTD(s1, s2, 0, 0, strg));
    }
}

//Output: 2

//TC: O(m*n)