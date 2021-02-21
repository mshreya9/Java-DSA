class Solution {
    public int numTrees(int n) {
        //This follows Catalan Series
        //Bottom Up DP Code
        int[] strg = new int[n+1];
        strg[0] = 1;
        strg[1] = 1;
        for(int num = 2; num < strg.length; num++){
            int total = 0;
            for(int i = 1; i <= num; i++){
                int l = strg[i-1];
                int r = strg[num-i];
                int ans = l*r;
                total += ans;
            }
            strg[num] = total;
        }
        return strg[n];
    }
}