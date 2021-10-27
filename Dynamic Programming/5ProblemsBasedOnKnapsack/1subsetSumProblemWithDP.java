import java.util.*;

class Solution {
    public static boolean subsetSum(int arr[], int sum, int n){
        boolean[][] t = new boolean[n+1][sum+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < sum+1; j++){
                if(i == 0){
                    t[i][j] = false;
                }
                if(j == 0){
                    t[i][j] = true;
                }
            }
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < sum+1; j++){
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 8, 10};
        int sum = 14;
        System.out.println(subsetSum(arr, sum, 5)); 
    }
}

//If sum = 11, Output: true
//If sum = 14, Output: false
