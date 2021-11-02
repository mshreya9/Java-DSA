class Solution {
    public int tribonacci(int n) {
        int[] strg = new int[n+1];
        if(n == 0){
            return 0;
        } else if(n < 3){
            return 1;
        }
        strg[0] = 0;
        strg[1] = 1;
        strg[2] = 1;

        for(int i = 3; i <= n; i++){
            strg[i] = strg[i-1] + strg[i-2] + strg[i-3];
        }

        return strg[n];
    }
}