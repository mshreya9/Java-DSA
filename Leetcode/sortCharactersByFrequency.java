class Solution {
    static class Pair{
        int first;
        char second;
    }
    
    public String frequencySort(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
                public int compare(Pair a, Pair b){
                    return b.first - a.first;
                }
            }
        );

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(Character i : map.keySet()){
            Pair p = new Pair();
            p.first = map.get(i);
            p.second = i;
            pq.add(p);
        }
        while(pq.size() > 0){
            int freq = pq.peek().first;
            char elem = pq.peek().second;
            for(int i = 1; i <= freq; i++){
                sb.append(elem);
            }
            pq.poll();
        }
        return sb.toString();
    }
}