public class WineProblemBottomUp {
    public static int WPBU(int[] arr){
        int n = arr.length;
        int[][] strg = new int[n][n];
        for(int slide = 0; slide <= n-1; slide++){
            for(int si = 0; si <= n-slide-1; si++){
                int ei = si + slide;
                int yr = arr.length - (ei-si+1) + 1;
                if(si == ei){
                    strg[si][ei] = arr[si] * yr;
                }
                else{
                    int start = strg[si+1][ei] + arr[si] * yr;
                    int end = strg[si][ei-1] + arr[ei] * yr;
                    int ans = Math.max(start, end);
                    strg[si][ei] = ans;
                }
            }
        }
        return strg[0][n-1];
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,4};
        System.out.println(WPBU(arr)); 
    }
}

//Output: 50