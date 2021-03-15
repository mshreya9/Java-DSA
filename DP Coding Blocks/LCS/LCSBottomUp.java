public class LCSBottomUp {
    public static int LCSBU(String s1, String s2){
        int[][] strg = new int[s1.length()+1][s2.length()+1];
        for(int row = s1.length()-1; row >= 0; row--){
            for(int col = s2.length()-1; col >= 0; col--){
                if(s1.charAt(row) == s2.charAt(col)){
                    strg[row][col] = strg[row+1][col+1] + 1;
                }
                else{
                    int op1 = strg[row][col+1];
                    int op2 = strg[row+1][col];
                    strg[row][col] = Math.max(op1, op2);
                }
            }
        }
        return strg[0][0];
    }

    public static void main(String[] args) {
        System.out.println(LCSBU("abcd", "agcfd")); 
    }
}

//Output: 3