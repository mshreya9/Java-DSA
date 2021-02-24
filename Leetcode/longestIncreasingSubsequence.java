class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] strg = new int[nums.length];
        Arrays.fill(strg, 1);
        for(int i = 0; i < strg.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    strg[i] = Math.max(strg[i], strg[j]+1);
                }
            }
        }
        int max = 1;
        for(int i = 0; i < strg.length; i++){
            if(strg[i] > max){
                max = strg[i];
            }
        }
        return max;
    }
}