class Solution {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE, max = 0;
        for(int i = 0; i < nums.length; i++){
            max = max + nums[i]; 
            if(maxSoFar < max){ 
                maxSoFar = max;
            } 
            if(max < 0){
                max = 0;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

//Output
//6