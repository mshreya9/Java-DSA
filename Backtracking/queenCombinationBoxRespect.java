public class queenCombinationBoxRespect {
    public static void main(String[] args) {
        QueenCombinationWRTBox(new boolean[4], 0, 0, 2, "");
    }
    public static void QueenCombinationWRTBox(boolean[] board, int col, int qpsf, int tq, String ans){
        //Positive base case
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }

        //Negative base case
        if(col == board.length){
            return;
        }

        //Place queen in the box
        board[col] = true;
        QueenCombinationWRTBox(board, col+1, qpsf+1, tq, ans+"b"+col);
        board[col] = false; //undo operation (backtrack)

        //Queen not placed in the box
        QueenCombinationWRTBox(board, col+1, qpsf, tq, ans);
    }
}

//Output:

// b0b1
// b0b2
// b0b3
// b1b2
// b1b3
// b2b3