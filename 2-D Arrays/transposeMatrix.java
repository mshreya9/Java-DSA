class Solution {
    public static int[][] transpose(int[][] A) {
        int[][] arr = new int[A[0].length][A.length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                arr[j][i] = A[i][j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] T = transpose(A);
        for(int i = 0; i < T.length; i++){
            for(int j = 0; j < T[i].length; j++){
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Output
// 1 4 7 
// 2 5 8
// 3 6 9