//Brute force
//Time Complexity : O(N^2)
//Space Complexity : O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}

//Hash Table
//Time Complexity : O(N)
//Space Complexity : O(N)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            int y = target - nums[i];
            if(map.containsKey(y)){
                arr[0] = i;
                arr[1] = map.get(y);
                return arr;
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}