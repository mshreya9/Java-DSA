class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //imp to check constraints
        int[] count = new int[1001];
        for(int i : arr1){
            count[i]++;
        }
        
        int k = 0;
        for(int i : arr2){
            while(count[i]-- > 0) {
                arr1[k++] = i;
            }
        }
        
        for(int i = 0; i < count.length; i++) {
            while(count[i]-- > 0) {
                arr1[k++] = i;
            }
        }
        
        return arr1;
    }
}