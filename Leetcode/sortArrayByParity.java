class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] arr = new int[A.length];
        int index = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                arr[index++] = A[i];
            }
        }
        int in = index;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 != 0){
                arr[in++] = A[i];
            }
        }
        return arr;
    }
}