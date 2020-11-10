import java.util.*;

class Solution {
    public static ArrayList<Integer> kLargestElements(int[] arr, int k, int n){
        ArrayList<Integer> list = new ArrayList<>(k);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        while(pq.size() > 0){
            list.add(pq.peek());
            pq.poll();
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int n = arr.length;
        int k = 3;
        System.out.println(kLargestElements(arr, k, n));
    }
}

//Output
//[10, 15, 20]