class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        
        int target = 0;
        Arrays.sort(nums);
		for(int i = 0; i < nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) {         
                continue;
            }
			int temp = nums[i];
			int newtarget = target - temp;
			int l = i+1;
			int r = nums.length-1;
			while(l < r){
				if(nums[l] + nums[r] == newtarget){
                    List<Integer> list = new ArrayList<>();
					list.add(temp);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    ansList.add(list);
					l++;
					r--;
                    while(l < r && nums[l] == nums[l - 1]){
                        l++; 
                    }
                    while(l < r && nums[r] == nums[r + 1]){
                        r--;  
                    }
				}
				else if(nums[l] + nums[r] > newtarget){
					r--;
				}
				else{
					l++;
				}
			}
		}
        return ansList;
    }
}