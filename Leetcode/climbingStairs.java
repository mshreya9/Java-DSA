class Solution {
    public int climbStairs(int n) {
        int[] strg = new int[n];
        return climbTopDown(0, n, strg);
    }
    
    public int climbTopDown(int i, int n, int[] strg){
        if(i > n){
            return 0;
        }
        if(i == n){
            return 1;
        }
        if(strg[i] != 0){
            return strg[i];
        }
        int climb1 = climbTopDown(i+1, n, strg);
        int climb2 = climbTopDown(i+2, n, strg);
        int climb = climb1 + climb2;
        
        strg[i] = climb;
        return strg[i];
    }
}

//Note: Recursive code will give TLE