public class MazePathTopDown {
    public static int MPTD(int cr, int cc, int er, int ec, int[][] strg){
        //Base Case
        if(cr == er && cc == ec){
            return 1;
        }

        if(cr > er || cc > ec){
            return 0;
        }

        if(strg[cr][cc] != 0){ //re use
            return strg[cr][cc];
        }

        int ch = MPTD(cr, cc+1, er, ec, strg);
        int cv = MPTD(cr+1, cc, er, ec, strg);

        strg[cr][cc] = ch+cv; //store
        return ch+cv;
    }
    
    public static void main(String[] args) {
        int n = 2;
        System.out.println(MPTD(0, 0, n, n, new int[n+1][n+1]));
    }
}

//Output: 6
//TC: O(er*ec)
//SC: O(er*ec) + Rec extra space(implcit)