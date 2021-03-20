public class WildcardPatternMatchingBottomUp {
    public static boolean WildcardMatchingBU(String src, String pat){
        boolean[][] strg = new boolean[src.length()+1][pat.length()+1];
        for(int row = src.length(); row >= 0; row--){
            for(int col = pat.length()-1; col >= 0; col--){
                if(row == src.length()){
                    if(pat.charAt(col) == '*'){
                        strg[row][col] = strg[row][col+1];
                    }
                    else{
                        strg[row][col] = false;
                    }
                    continue;
                }

                char chs = src.charAt(row);
                char chp = src.charAt(col);
                boolean ans;

                if(chp == chs || chp == '?'){
                    ans = strg[row+1][col+1];
                }
                else if(chp == '*'){
                    boolean blank = strg[row][col+1];
                    boolean multiple = strg[row+1][col];
                    ans = blank || multiple;
                }
                else{
                    ans = false;
                }

                strg[row][col] = ans;
            }
        }

        return strg[0][0];
    }

    public static void main(String[] args) {
        String src = "baaabab";
        String pat = "ba*a?";
        System.out.println(WildcardMatchingBU(src, pat));
    }
}
