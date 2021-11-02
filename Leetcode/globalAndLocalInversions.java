class Solution {
    public boolean isIdealPermutation(int[] A) {
        for(int i = 0; i < A.length; i++){
            for(int j = i + 2; j < A.length; j++){
                if(A[j] < A[i]){
                    return false;
                }
            }
        }
        return true;
    }
}