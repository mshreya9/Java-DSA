import java.util.*;

class Solution {
    public static int subsetSum(int arr[], int sum){
        //Initialization
        boolean[][] t = new boolean[arr.length+1][sum+1];
        for(int i = 0; i < arr.length+1; i++){
            for(int j = 0; j < sum+1; j++){
                if(i == 0){
                    t[i][j] = false;
                }
                if(j == 0){
                    t[i][j] = true;
                }
            }
        }

        //Filling the matrix
        for(int i = 1; i < arr.length+1; i++){
            for(int j = 1; j < sum+1; j++){
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        //Adding the last row 'true' values to the list
        //Range will be sum/2
        List<Integer> lastRow = new ArrayList<>();
        for(int j = 0; j <= sum/2; j++){
            if(t[arr.length][j] == true){
                lastRow.add(j);
            }
        }

        //Finding minimum value of Range-2S1; Range is sum and S1 is the smaller subset
        int low = Integer.MAX_VALUE;
        for(int i  = 0; i < lastRow.size(); i++){
            low = Math.min(low, sum-2*(lastRow.get(i)));
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = {1, 6, 11, 5};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(subsetSum(arr, sum)); 
    }
}

//arr[] = {1, 6, 11, 5}; Output: 1
//arr[] = {1, 2, 7}; Output: 4
