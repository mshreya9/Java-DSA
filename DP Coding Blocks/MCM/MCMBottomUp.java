public class MCMBottomUp {
    public static int MCMBU(int[] arr){
        int n = arr.length;
        int[][] strg = new int[n][n];
        for(int slide = 1; slide <= n-1; slide++){
            for(int si = 0; si <= n-slide-1; si++){
                int ei = si + slide;
                if(si + 1 == ei){
                    strg[si][ei] = 0;
                }
                else{
                    int min = Integer.MAX_VALUE;

                    //k:splits
                    for(int k = si+1; k <= ei-1; k++){
                        int fp = strg[si][k];
                        int sp = strg[k][ei];
                        int sw = arr[si] * arr[k] * arr[ei];
                        int total = fp + sp + sw;
                        if(total < min){
                            min = total;
                        }
                    }

                    strg[si][ei] = min;
                }
            }
        }

        return strg[0][n-1];
    }

    public static void main(String[] args) {
        int[] arr = {4,2,3,5,1};
        System.out.println(MCMBU(arr)); 
    }
}

//Output: 29