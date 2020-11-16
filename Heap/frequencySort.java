import java.util.*;

class Solution {
    private static class Pair {
        int first;
        int second;
    }

    public static void freqSort(int[] arr){
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
                public int compare(Pair a, Pair b){
                    return b.first - a.first;
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

        for(Integer i : map.keySet()){
            // create a new pair
            Pair p = new Pair();
            p.first = map.get(i);
            p.second = i;
            pq.add(p);
        }
        while(pq.size() > 0){
            int freq = pq.peek().first;
            int elem = pq.peek().second;
            for(int i = 1; i <= freq; i++){
                System.out.print(elem + " ");
            }
            pq.poll();
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,2,2,4};
        freqSort(arr);
    }
}

//Output:
//1 1 1 2 2 3 4