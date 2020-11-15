import java.util.*;

class Solution {
    static class Pair {
        int first;
        int second;
    }
    public static void kClosestNumbers(int[] arr, int k, int X){
        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>(){
                public int compare(Pair a, Pair b){
                    return b.first-a.first;
                }
            }
        );

        for(int i = 0; i < arr.length; i++){
            // create a new pair
            Pair p = new Pair();
            p.first = Math.abs(arr[i] - X);
            p.second = arr[i];
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
        int[] arr = {5,6,7,8,9};
        int k = 3;
        int X = 7;
        kClosestNumbers(arr, k, X);
    }
}

//Output:
// 6
// 8
// 7