//Given a 2D array of size N x N. Rotate the array 90 degrees anti-clockwise.

class Solution {
    public static void main(String[] args) {
        int n = 4;
		int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		display(arr);

    }

    public static void display(int[][] arr){
		int n = arr.length;
		int[][] ans = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = n-1; j >= 0; j--){
				ans[i][j] = arr[j][i];
			}
		}

		for(int i = n-1; i >= 0; i--){
			for(int j = 0; j < n; j++){
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/*
Output
4 8 12 16 
3 7 11 15
2 6 10 14
1 5 9 13
*/