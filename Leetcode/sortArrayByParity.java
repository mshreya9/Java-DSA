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

//OR

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] arr = new int[A.length];
        int k = 0;
        int t = A.length - 1;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                arr[k++] = A[i];
            }
            else{
                arr[t--] = A[i];
            }
        }
        return arr;
    }
}

//In-place
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length-1;
        while(i < j){
            if(A[i] % 2 == 0){
                i++;
            }
            else{
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                if(A[i] % 2 == 0){
                    i++;
                }
                j--;
            }
        }
        return A;
    }
}