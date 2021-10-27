import java.util.*;

class Solution {
    public static int subsetSum(int arr[], int diff){
        int n = arr.length;
        int arrSum = 0;
        for(int i = 0; i < n; i++){
            arrSum += arr[i];
        }
        int sum = (diff + arrSum) / 2;

        if(diff > arrSum){
            return 0;
        }
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

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < sum+1; j++){
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3};
        int diff = 1;
        System.out.println(subsetSum(arr, diff)); 
    }
}

//Output: 3