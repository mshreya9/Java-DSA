public class queenCombinationBoxRespect2D {
    public static void main(String[] args) {
        QueenCombinationWRTBox2D(new boolean[2][2], 0, 0, 0, 2, "");
    }

    public static void QueenCombinationWRTBox2D(boolean[][] board, int row, int col, int qpsf, int tq, String ans){
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

        //Another approach to manually chnaging variables -- Extra recursive call
        // if(col == board[0].length){
        //     QueenCombinationWRTBox2D(board, row+1, 0, qpsf, tq, ans);
        //     return; //this return statement is very imp cause we don't want to run place queen call and not place queen call
        // }

        //Negative Base Case
        if(row == board.length){
            return;
        }

        //Place queen in the box
        board[row][col] = true;
        QueenCombinationWRTBox2D(board, row, col+1, qpsf+1, tq, ans+"{"+row+"-"+col+"}");
        board[row][col] = false;

        //Queen not placed in the box
        QueenCombinationWRTBox2D(board, row, col+1, qpsf, tq, ans);
    }
}

//Output

// {0-0}{0-1}
// {0-0}{1-0}
// {0-0}{1-1}
// {0-1}{1-0}
// {0-1}{1-1}
// {1-0}{1-1}