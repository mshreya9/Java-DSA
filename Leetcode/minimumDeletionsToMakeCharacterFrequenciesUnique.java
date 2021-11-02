class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer> map = new HashMap();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else{
                map.put(s.charAt(i), 1);
            }
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(Integer i : map.values()){
            pq.add(i);
        }
        
        int count = 0;
        while(pq.size() > 0){
            int rm = pq.remove();
            if(pq.size() == 0 ){
				return count;
			}
            
            if(rm == pq.peek()) {
				if(rm > 1) {
					pq.add(rm - 1);
				}
				count++;
			}
        }
        
        return count;
    }
}