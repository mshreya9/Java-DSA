//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//You may assume that the array is non-empty and the majority element always exist in the array.

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Integer i : map.keySet()) {
            if (map.get(i) > Math.floor(nums.length / 2)) {
                return i;
            }
        }
        return -1;
    }
}

//Moore Voting Algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count += 1;
            }
            else{
                count -= 1;
            }
        }
        return candidate;
    }
}