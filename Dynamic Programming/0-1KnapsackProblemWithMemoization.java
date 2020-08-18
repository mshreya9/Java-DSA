import java.util.*;

class Solution {
    public static int knapsackM(int wt[], int val[], int W, int n){
        int[][] t =  new int[102][1002];
        for(int i = 0; i < 102; i++){
            for(int j = 0; j < 1002; j++){
                t[i][j] = -1;
            }
        }

        if(n == 0 || W == 0){
            return 0;
        }

        if(t[n][W] != -1){
            return t[n][W];
        }

        if(wt[n-1] <= W){
            t[n][W] = Math.max(val[n-1] + knapsackM(wt, val, W-wt[n-1], n-1), knapsackM(wt, val, W, n-1));
            return t[n][W];
        }

        else if(wt[n-1] > W){
            t[n][W] = knapsackM(wt, val, W, n-1);
            return t[n][W];
        }
        return 0;
    }
    public static void main(String[] args) {
        int wt[] = {1, 3, 4, 5};
        int val[] = {1, 4, 5, 7};
        int W = 7;
        System.out.println(knapsackM(wt, val, W, 4)); 
    }
}

//Output: 9