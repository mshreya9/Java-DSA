class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            } else{
                map.put(nums[i], 1);
            }
        }
        
        List<Pair> list = new ArrayList();
        for(Integer i : map.keySet()){
            list.add(new Pair(i, map.get(i)));
        }
        
        Collections.sort(list);
        
        int[] ans = new int[nums.length];
        int idx = 0;
        for(int i = 0; i < list.size(); i++){
            int count = list.get(i).freq;
            while(count-- > 0){
                ans[idx++] = list.get(i).number;
            }
        }
        
        return ans;
    }
}

class Pair implements Comparable<Pair> {
    int number;
    int freq;
    
    public Pair(int number, int freq){
        this.number = number;
        this.freq = freq;
    }
    
    @Override
    public int compareTo(Pair o){
        if(this.freq == o.freq){
            return o.number - this.number;
        }
        return this.freq - o.freq;
    }
}