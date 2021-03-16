public class WineProblemTopDown {
    public static int WPTD(int[] arr, int si, int ei, int[][] strg){
        int yr = arr.length - (ei-si+1) + 1;
        if(si == ei){
            return arr[si] * yr;
        }

        if(strg[si][ei] != 0){ // re use
            return strg[si][ei];
        }

        int start = WPTD(arr, si+1, ei, strg) + arr[si]*yr;
        int end = WPTD(arr, si, ei-1, strg) + arr[ei]*yr;
        
        int ans = Math.max(start, end);
        strg[si][ei] = ans; //store

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,4};
        int[][] strg = new int[arr.length][arr.length];
        System.out.println(WPTD(arr, 0, arr.length-1, strg)); 
    }
}


//Output: 50