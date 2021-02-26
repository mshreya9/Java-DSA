//Exactly same as QueenCombination2DKill question, only that QueenCombination2DKill is a bit more generic (it can have rectangular boards and any number of queens)

public class NQueen {
    public static void main(String[] args) {
        NQueenProblem(new boolean[4][4], 0, 0, 0, 4, "");
    }

    public static void NQueenProblem(boolean[][] board, int row, int col, int qpsf, int tq, String ans){
        //Positive Base Case
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }

        //Manually change variables when exceed column
        if(col == board[0].length){
            row++;
            col = 0;
        }

        //Negative Base Case
        if(row == board.length){
            return;
        }

        //Place queen in the box ONLY IF IT IS SAFE
        if(isItSafeToPlaceTheQueen(board, row, col)){
            board[row][col] = true;
            //to save some recursion calls we can give a call to => (row -> row+1) and (col -> 0)
            NQueenProblem(board, row+1, 0, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
            board[row][col] = false;    
        }
       
        //Queen not placed in the box
        NQueenProblem(board, row, col+1, qpsf, tq, ans);
    }

    public static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col){
        //vertically upward
        int r = row-1;
        int c = col;
        while(r >= 0){
            if(board[r][c]){
                return false;
            }
            r--;
        }

        //Horizontally left
        r = row;
        c = col-1;
        while(c >= 0){
            if(board[r][c]){
                return false;
            }
            c--;
        }

        //Diagonally left
        r = row-1;
        c = col-1;
        while(r >= 0 && c >= 0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

        //Diagonally right
        r = row-1;
        c = col+1;
        while(r >= 0 && c < board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }

        return true;
    }
}


//Output:

// {0-1}{1-3}{2-0}{3-2}
// {0-2}{1-0}{2-3}{3-1}
