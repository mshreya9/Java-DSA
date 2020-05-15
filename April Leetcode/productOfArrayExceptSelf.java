//Question
//Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int x = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    x = x * nums[j];
                }

            }
            arr[i] = x;
        }
        return arr;
    }
}