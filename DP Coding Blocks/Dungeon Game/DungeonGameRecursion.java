public class DungeonGameRecursion {
    public static int DungeonGameRecursive(int[][] arr, int cr, int cc, int er, int ec){
        //Base Case
        if(cr == er && cc == ec){
            return arr[cr][cc] <= 0 ? -arr[cr][cc] + 1 : 1;
        }

        if(cr > er || cc > ec){
            return Integer.MAX_VALUE;
        }

        int r = DungeonGameRecursive(arr, cr, cc+1, er, ec);
        int d = DungeonGameRecursive(arr, cr+1, cc, er, ec);
        int path = Math.min(r,d);
        int amountAlreadyHave = path - arr[cr][cc];
        int ans;
        if(amountAlreadyHave >= 1){
            ans = amountAlreadyHave;
        }
        else{
            ans = 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        int cr = 0, cc = 0;
        int er = arr.length-1, ec = arr[0].length-1;
        System.out.println(DungeonGameRecursive(arr, cr, cc, er, ec)); 
    }
}

//Output: 7