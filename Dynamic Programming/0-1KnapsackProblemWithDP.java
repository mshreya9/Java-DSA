import java.util.*;

class Solution {
    public static int knapsack(int wt[], int val[], int W, int n){
        int[][] t = new int[n+1][W+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < W+1; j++){
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < W+1; j++){
                if(wt[i-1] <= j){
                    t[i][j] = Math.max((val[i-1] + t[i-1][j-wt[i-1]]), t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][W];
    }
    public static void main(String[] args) {
        int wt[] = {1, 3, 4, 5};
        int val[] = {1, 4, 5, 7};
        int W = 7;
        System.out.println(knapsack(wt, val, W, 4)); 
    }
}

//Output: 9