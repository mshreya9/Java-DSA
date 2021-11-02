class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
		for(int i = 0; i < nums.length; i++){
			xor ^= nums[i]; 
		}

		//imp step (get the rightmot set bit in xor by doing bitwise &)
		xor = (xor & -xor);

		int xor1 = 0;
        int xor2 = 0;

		for(int i = 0; i < nums.length; i++){
            if((nums[i] & xor) > 0){
                xor1 ^= nums[i];
            }
            else{
                xor2 ^= nums[i];
            }
		}
        
        int[] ans = new int[2];
        ans[0] = xor1;
        ans[1] = xor2;
        
        return ans;
    }
}