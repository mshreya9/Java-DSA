public class EditDistanceBottomUp {
    public static int EDBU(String s1, String s2){
        int[][] strg = new int[s1.length()+1][s2.length()+1];
        for(int row = s1.length(); row >= 0; row--){
            for(int col = s2.length(); col >= 0; col--){
                if(row == s1.length()){
                    strg[row][col] = s2.length() - col;
                }
                else if(col == s2.length()){
                    strg[row][col] = s1.length() - row;
                }
                else{
                    if(s1.charAt(row) == s2.charAt(col)){
                        strg[row][col] = strg[row+1][col+1];
                    }
                    else{
                        int i = strg[row+1][col];
                        int d = strg[row][col+1];
                        int r = strg[row+1][col+1];

                        strg[row][col] = Math.min(i, Math.min(d,r)) + 1;
                    }
                }
            }
        }
        return strg[0][0];
    }

    public static void main(String[] args) {
        System.out.println(EDBU("abcd", "agcfd")); 
    }
}

//Output: 2