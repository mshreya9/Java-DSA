import java.util.Arrays;

public class MazePathBottomUpSpaceEfficient {
    public static int MPBUSE(int er, int ec){
        int[] strg = new int[ec+1];
        Arrays.fill(strg, 1);
        for(int slide = er-1; slide >= 0; slide--){
            for(int col = ec; col >= 0; col--){
                if(col == ec){
                    strg[col] = 1;
                }
                else{
                    strg[col] = strg[col] + strg[col+1];
                }
            }
        }

        return strg[0];
    }
    
    public static void main(String[] args) {
        System.out.println(MPBUSE(2, 2)); 
    }
}

//Output: 6
//TC: O(er*ec)
//SC: O(ec) 