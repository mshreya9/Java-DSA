public class DungeonGameBottomUp {
    public static int DungeonGameBU(int[][] arr){
        int[][] strg = new int[arr.length+1][arr[0].length+1];
        for(int row = strg.length-1; row >= 0; row--){
            for(int col = strg[0].length-1; col >= 0; col--){
                if(row == strg.length-2 && col == strg[0].length-2){
                    strg[row][col] = arr[row][col] <= 0 ? -arr[row][col] + 1 : 1;
                }
                else if(row == strg.length-1){
                    strg[row][col] = Integer.MAX_VALUE;
                }
                else if(col == strg[0].length-1){
                    strg[row][col] = Integer.MAX_VALUE;
                }
                else{
                    int r = strg[row][col+1];
                    int d = strg[row+1][col];
                    int path = Math.min(r,d);
                    int amountAlreadyHave = path - arr[row][col];
                    int ans;
                    if(amountAlreadyHave >= 1){
                        ans = amountAlreadyHave;
                    }
                    else{
                        ans = 1;
                    }

                    strg[row][col] = ans;
                }
            }
        }
        return strg[0][0];
    }

    public static void main(String[] args) {
        int[][] arr = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println(DungeonGameBU(arr)); 
    }
}

//Output: 7