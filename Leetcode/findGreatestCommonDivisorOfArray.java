class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int x = nums[0], y = nums[nums.length-1];
        int gcd = 1;
        for(int i = 1; i <= x && i <= y; i++){  
            if(x % i == 0 && y % i == 0){ 
                gcd = i;  
            }
        }
    
        return gcd;
    }
}