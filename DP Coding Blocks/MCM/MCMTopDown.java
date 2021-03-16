public class MCMTopDown {
    public static int MCMTD(int[] arr, int si, int ei, int[][] strg){
        if(si + 1 == ei){
            return 0;
        }

        if(strg[si][ei] != 0){ //re use
            return strg[si][ei];
        }

        int min = Integer.MAX_VALUE;

        //k: splits
        for(int k = si+1; k <= ei-1; k++){
            int fp = MCMTD(arr, si, k, strg);
            int sp = MCMTD(arr, k, ei, strg);
            int sw = arr[si] * arr[k] * arr[ei];
            int total = fp + sp + sw;
            if(total < min){
                min = total;
            }
        }

        strg[si][ei] = min; //storage
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,5,1};
        int si = 0;
        int ei = arr.length-1;
        int[][] strg = new int[arr.length][arr.length];
        System.out.println(MCMTD(arr, si, ei, strg)); 
    }
}

//Output: 29