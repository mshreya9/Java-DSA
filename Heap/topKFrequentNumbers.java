import java.util.*;

class Solution {
    private static class Pair {
        int first;
        int second;
    }

    public static void topKFreqNos(int[] arr, int k){
        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>(){
                public int compare(Pair a, Pair b){
                    return a.first-b.first;
                }
            }
        );

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        
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
            System.out.println(pq.peek().second);
            pq.poll();
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,2,2,4};
        int k = 2;
        topKFreqNos(arr, k);
    }
}

//Output:
//2
//1