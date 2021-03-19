public class DungeonGameTopDown {
    public static int DungeonGameTD(int[][] arr, int cr, int cc, int er, int ec, int[][] strg){
        //Base Case
        if(cr == er && cc == ec){
            return arr[cr][ec] <= 0 ? -arr[cr][cc] + 1 : 1;
        }
        if(cr > er || cc > ec){
            return Integer.MAX_VALUE;
        }
        
        //If we reach on the same cell then use the value already stored
        if(strg[cr][cc] != 0){
            return strg[cr][cc];
        }
        
        //2 moves -> rightwards and downwards
        int rightMove = DungeonGameTD(arr, cr, cc+1, er, ec, strg);
        int downMove = DungeonGameTD(arr, cr+1, cc, er, ec, strg);
        
        //Minimum of both moves
        int path = Math.min(rightMove, downMove);
        
        int amountAlreadyHave = path - arr[cr][cc];
        int ans;
        if(amountAlreadyHave >= 1){
            ans = amountAlreadyHave;
        } else{
            ans = 1;
        }
        
        //Store your ans at the problem index
        strg[cr][cc] = ans;
        
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        int cr = 0, cc = 0;
        int er = arr.length-1, ec = arr[0].length-1;
        int[][] strg = new int[arr.length][arr[0].length];
        System.out.println(DungeonGameTD(arr, cr, cc, er, ec, strg)); 
    }
}

//Output: 7