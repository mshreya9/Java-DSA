class Solution {
    public static int coinChange1(int[] coins, int sum){
        //Initialization
        int n = coins.length;
        int[][] t = new int[n+1][sum+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < sum+1; j++){
                if(i == 0){
                    t[i][j] = 0;
                }
                if(j == 0){
                    t[i][j] = 1;
                }
            }
        }

        //Unbounded Knapsack
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < sum+1; j++){
                if(coins[i-1] <= j){
                    t[i][j] = t[i][j-coins[i-1]] + t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 5;
        System.out.println(coinChange1(coins, sum));
    }
}

//Output: 5

//2+3 = 5
//1+1+3 = 5
//1+2+2 = 5
//1+1+1+2 = 5
//1+1+1+1+1 = 5