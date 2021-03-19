import java.util.Arrays;

public class MazePathDiagonalBottomUpSpaceEfficient {
    public static int MPDBUSE(int er, int ec){
        int[] strg = new int[ec+1];
        Arrays.fill(strg, 1);
        int diag = 0;
        for(int slide = er-1; slide >= 0; slide--){
            for(int col = ec; col >= 0; col--){
                if(col == ec){
                    strg[col] = 1;
                    diag = 1;
                }
                else{
                    int val = strg[col] + strg[col+1] + diag;
                    diag = strg[col];
                    strg[col] = val;
                }
            }
        }

        return strg[0];
    }
    
    public static void main(String[] args) {
        System.out.println(MPDBUSE(2, 2)); 
    }
}

//Output: 13
//TC: O(er*ec)
//SC: O(ec) 