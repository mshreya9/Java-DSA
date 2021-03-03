class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        //Duplicate number
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                arr[0] = nums[i];
            }
            set.add(nums[i]);
        }
        //Missing Number
        int j = 1;
        for(int i = 0; i <= set.size(); i++){
            if(!set.contains(j)){
                arr[1] = j;
                break;
            }
            j++;
        }
        
        return arr;
    }
}