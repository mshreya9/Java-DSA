public class WildcardPatternMatchingTopDown {
    public static boolean WildcardMatchingTD(String src, String pat, int svidx, int pvidx, int[][] strg){
        if(src.length() == svidx && pat.length() == pvidx){
            return true;
        }
        if(src.length() != svidx && pat.length() == pvidx){
            return false;
        }
        if(src.length() == svidx && pat.length() != pvidx){
            for(int i = pvidx; i < pat.length(); i++){
                if(pat.charAt(i) != '*'){
                    return false;
                }
            }
            return true;
        }

        if(strg[svidx][pvidx] != 0){
            return (strg[svidx][pvidx] == 2) ? true: false;
        }

        char chs = src.charAt(svidx);
        char chp = pat.charAt(pvidx);

        boolean ans;

        if(chp == chs || chp == '?'){
            ans = WildcardMatchingTD(src, pat, svidx+1, pvidx+1, strg);
        }
        else if(chp == '*'){
            boolean blank = WildcardMatchingTD(src, pat, svidx, pvidx+1, strg);
            boolean multiple = WildcardMatchingTD(src, pat, svidx+1, pvidx, strg);
            ans = blank || multiple;
        }
        else{
            ans = false;
        }

        strg[svidx][pvidx] = (ans == true ? 2 : 1);
        return ans;
    }

    public static void main(String[] args) {
        String src = "baaabab";
        String pat = "ba*a?";
        int svidx = 0;
        int pvidx = 0;
        int[][] strg = new int[src.length()+1][pat.length()+1];
        System.out.println(WildcardMatchingTD(src, pat, svidx, pvidx, strg));
    }
}

//Output: true