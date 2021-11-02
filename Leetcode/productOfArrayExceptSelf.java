//Question
//Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

//Improved Solution
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] lp = new int[n];
        int[] rp = new int[n];
        lp[0] = 1;
        rp[n-1] = 1;
        for(int i = 1; i < n; i++){
            lp[i] = lp[i-1] * nums[i-1];
        }
        for(int i = n-2; i >= 0; i--){
            rp[i] = rp[i+1] * nums[i+1];
        }
        
        for(int i = 0; i < n; i++){
            lp[i] = lp[i] * rp[i];
        }
        return lp;
    }
}

//Old Solution
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