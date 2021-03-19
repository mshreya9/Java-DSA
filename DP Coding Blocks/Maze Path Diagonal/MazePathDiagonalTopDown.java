public class MazePathDiagonalTopDown {
    public static int MPDTD(int cr, int cc, int er, int ec, int[][] strg){
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

        int ch = MPDTD(cr, cc+1, er, ec, strg);
        int cv = MPDTD(cr+1, cc, er, ec, strg);
        int cd = MPDTD(cr+1, cc+1, er, ec, strg);

        strg[cr][cc] = ch+cv+cd; //store
        return ch+cv+cd;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(MPDTD(0, 0, n, n, new int[n+1][n+1]));
    }
}

//Output: 13
//TC: O(er*ec)
//SC: O(er*ec) + Rec extra space(implcit)