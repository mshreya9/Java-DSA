class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
        }
        System.out.println(sum);
        int realSum = (n * (n + 1)) / 2;
        System.out.println(realSum);
        return realSum - sum;
    }
}