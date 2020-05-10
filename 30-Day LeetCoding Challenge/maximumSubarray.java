//Question
//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0; //[-2,1,-3,4,-1,2,1,-5,4]
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0)                         
                sum = nums[i];
            else 
                sum += nums[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }
}
