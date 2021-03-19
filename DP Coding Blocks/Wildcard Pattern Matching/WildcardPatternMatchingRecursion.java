public class WildcardPatternMatchingRecursion {
    public static boolean WildcardMatchingRecursion(String src, String pat, int svidx, int pvidx){
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

        char chs = src.charAt(svidx);
        char chp = pat.charAt(pvidx);

        boolean ans;

        if(chp == chs || chp == '?'){
            ans = WildcardMatchingRecursion(src, pat, svidx+1, pvidx+1);
        }
        else if(chp == '*'){
            boolean blank = WildcardMatchingRecursion(src, pat, svidx, pvidx+1);
            boolean multiple = WildcardMatchingRecursion(src, pat, svidx+1, pvidx);
            ans = blank || multiple;
        }
        else{
            ans = false;
        }

        return ans;
    }

    public static void main(String[] args) {
        String src = "baaabab";
        String pat = "ba*a?";
        int svidx = 0;
        int pvidx = 0;
        System.out.println(WildcardMatchingRecursion(src, pat, svidx, pvidx));
    }
}

//Output: true