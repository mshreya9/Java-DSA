class Solution {
    public static int solve(int[] arr, int i, int j){
        int[][] t = new int[1001][1001];
        for(int p = 0; p < 1001; p++){
            for(int q = 0; q < 1001; q++){
                t[p][q] = -1;
            }
        }

        if(i >= j){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for(int k = i; k <= j-1; k++){
            int temp = solve(arr, i, k) + solve(arr, k+1, j) + arr[i-1]*arr[k]*arr[j];
            if(temp < min){
                min = temp;
            }
        }
        
        t[i][j] = min;
        return t[i][j];
    }
    public static void main(String[] args) {
        int[] arr = {40, 20, 30, 10, 30};
        int n = arr.length;
        System.out.println(solve(arr, 1, n-1));
    }
}

//Output: 26000