class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int xor = nums[i] ^ nums[j];
                if(xor > max){
                    max = xor;
                }
            }
        }
        return max;
    }
}