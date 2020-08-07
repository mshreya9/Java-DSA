class Solution {
    public int xorOperation(int n, int start) {
        int xor = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = start + 2*i;
            xor = xor ^ arr[i];
        }
        return xor;
    }
}