import java.util.*;

class Solution {
    public static int kthSmallestElement(int[] arr, int k, int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int n = arr.length;
        int k = 3;
        System.out.println(kthSmallestElement(arr, k, n));
    }
}

//Output: 7