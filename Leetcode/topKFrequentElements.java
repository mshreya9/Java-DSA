import java.util.*;
class Solution {
    static class Pair {
        int first;
        int second;
    }
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>(){
                public int compare(Pair a, Pair b){
                    return a.first-b.first;
                }
            }
        );

        //Sorting on the basis of the frequency of elements in the map
        for(Integer i : map.keySet()){
            // create a new pair
            Pair p = new Pair();
            p.first = map.get(i);
            p.second = i;
            pq.add(p);
            if(pq.size() > k){
                pq.poll();
            }
        }
        while(pq.size() > 0){
            list.add(pq.peek().second);
            pq.poll();
        }
        
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}