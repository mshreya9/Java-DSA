import java.util.Arrays;

public class PalindromePartitioningTopDown {
    public static int PPTD(String s, int si, int ei, int[][] strg){
        if(isPalindrome(s,si,ei)){
            return 0;
        }

        if(strg[si][ei] != -1){
            return strg[si][ei];
        } 

        int min = Integer.MAX_VALUE;
        for(int k = si; k <= ei-1; k++){
            int fp = PPTD(s, si, k, strg);
            int sp = PPTD(s, k+1, ei, strg);

            int total = fp+sp+1;
            if(total < min){
                min = total;
            }
        }

        strg[si][ei] = min;
        return min;
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
        int[][] strg = new int[s.length()][s.length()];
        for(int i = 0; i < strg.length; i++){
            Arrays.fill(strg[i], -1);
        }
        System.out.println(PPTD(s, 0, s.length()-1, strg)); 
    }
}

//Output: 2
