class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer i : map.keySet()){
            if(map.get(i) > Math.floor(n/3)){
                list.add(i);
            }
        }
        return list;
    }
}