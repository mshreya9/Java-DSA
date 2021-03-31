class Solution {
    public int totalHammingDistance(int[] nums) {
        int distance = 0;
        for(int i = 0; i < 32; i++){
            int oneCount = 0;
            for(int j = 0; j < nums.length; j++){
                oneCount += (nums[j] >> i) & 1;
            }
            distance += oneCount * (nums.length - oneCount);
        }
        return distance;
    }
}