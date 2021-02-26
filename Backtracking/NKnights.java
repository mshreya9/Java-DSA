public class NKnights {

    static int count = 0;
    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];
        NKnightsProblem(board, 0, 0, 0, board.length, "");
    }   
    
    public static void NKnightsProblem(boolean[][] board, int row, int col, int kpsf, int tk, String ans){
        //Positive Base Case
        if(kpsf == tk){
            System.out.println(++count + ". " + ans);
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

        //Place knight in the board ONLY IF IT IS SAFE
        if(isItSafeToPlaceTheKnight(board, row, col)){
            board[row][col] = true;
            NKnightsProblem(board, row, col+1, kpsf+1, tk, ans+"{"+row+"-"+col+"}");
            board[row][col] = false;    
        }
       
        //Knight not placed in the box
        NKnightsProblem(board, row, col+1, kpsf, tk, ans);
    }

    public static boolean isItSafeToPlaceTheKnight(boolean[][] board, int row, int col){
        int[] rowArr = {-1, -2, -2, -1};
        int[] colArr = {2, 1, -1, -2};

        for(int i = 0; i < 4; i++){
            int r = row + rowArr[i];
            int c = col + colArr[i];

            if(r >= 0 && r < board.length && c >= 0 && c < board[0].length){
                //If any knight is present at any board cell, then we will return false, cause we cannot place the knight at that cell
                if(board[r][c]){
                    return false;
                }
            }
        }

        return true;
    }
}

//Output:

// 1. {0-0}{0-1}{0-2}
// 2. {0-0}{0-1}{1-0}
// 3. {0-0}{0-1}{1-1}
// 4. {0-0}{0-2}{1-1}
// 5. {0-0}{0-2}{2-0}
// 6. {0-0}{0-2}{2-2}
// 7. {0-0}{1-0}{1-1}
// 8. {0-0}{1-0}{2-0}
// 9. {0-0}{1-1}{2-0}
// 10. {0-0}{1-1}{2-2}
// 11. {0-0}{2-0}{2-2}
// 12. {0-1}{0-2}{1-1}
// 13. {0-1}{0-2}{1-2}
// 14. {0-1}{1-0}{1-1}
// 15. {0-1}{1-0}{1-2}
// 16. {0-1}{1-0}{2-1}
// 17. {0-1}{1-1}{1-2}
// 18. {0-1}{1-1}{2-1}
// 19. {0-1}{1-2}{2-1}
// 20. {0-2}{1-1}{1-2}
// 21. {0-2}{1-1}{2-0}
// 22. {0-2}{1-1}{2-2}
// 23. {0-2}{1-2}{2-2}
// 24. {0-2}{2-0}{2-2}
// 25. {1-0}{1-1}{1-2}
// 26. {1-0}{1-1}{2-0}
// 27. {1-0}{1-1}{2-1}
// 28. {1-0}{1-2}{2-1}
// 29. {1-0}{2-0}{2-1}
// 30. {1-1}{1-2}{2-1}
// 31. {1-1}{1-2}{2-2}
// 32. {1-1}{2-0}{2-1}
// 33. {1-1}{2-0}{2-2}
// 34. {1-1}{2-1}{2-2}
// 35. {1-2}{2-1}{2-2}
// 36. {2-0}{2-1}{2-2}