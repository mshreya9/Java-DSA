class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int prod = 0;
            for(int j = i+1; j < nums.length; j++){
                prod = (nums[i] - 1) * (nums[j] - 1);
                if(prod > max){
                    max = prod;
                }
            }
        }
        return max;
    }
}