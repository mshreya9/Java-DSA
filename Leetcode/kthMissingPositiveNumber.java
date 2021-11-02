class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 1, m = 0, idx = 0;
        while(i > 0){
            if(k == 0){
                return m;
            }
            if(idx == arr.length){
                k--;
                m = i;
            }
            if(idx < arr.length && arr[idx] != i){
                k--;
                m = i;
            } else if(idx < arr.length){
                idx++;
            }
            i++;
        }
        
        return -1;
    }
}