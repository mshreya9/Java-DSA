import java.util.*;

class Solution {
    public static int minCost(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr){
            pq.add(i);
        }
        int totalCost = 0;
        while(pq.size() >= 2){
            int first = pq.peek();
            pq.poll();
            int second = pq.peek();
            pq.poll();
            totalCost = totalCost + first + second;
            pq.add(first + second);
        }
        return totalCost;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(minCost(arr));
    }
}

//Output
//33