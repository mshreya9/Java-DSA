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

//Boyer Moore Voting Algorithm
//There can be maximum 2 majority elements and minimum zero
//Time Complexity : O(N)
//Space Complexity : O(1)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int num1 = -1, num2 = -1, count1 = 0, count2 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == num1){
                count1++;
            }
            else if(nums[i] == num2){
                count2++;
            }
            else if(count1 == 0){
                num1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0){
                num2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        count1 = count2 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == num1){
                count1++;
            }
            if(nums[i] == num2){
                count2++;
            }
        }
        
        if(count1 > n/3){
            list.add(num1);
        }
        if(count2 > n/3){
            list.add(num2);
        }
        
        return list;
    }
}

