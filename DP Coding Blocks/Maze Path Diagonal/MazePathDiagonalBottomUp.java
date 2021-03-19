public class MazePathDiagonalBottomUp {
    public static int MPBU(int er, int ec){
        int[][] strg = new int[er+2][ec+2];
        for(int row = er; row >= 0; row--){
            for(int col = ec; col >= 0; col--){
                if(row == er && col == ec){
                    strg[row][col] = 1;
                }
                else{
                    strg[row][col] = strg[row][col+1] + strg[row+1][col] + strg[row+1][col+1];
                }
            }
        }

        return strg[0][0];
    }
    
    public static void main(String[] args) {
        System.out.println(MPBU(2, 2));   
    }
}

//Output: 13
//TC: O(er*ec)
//SC: O(er*ec)