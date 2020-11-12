// Sort a k sorted array | Sort Nearly Sorted Array

import java.util.*;

class Solution {
    public static List<Integer> sortArray(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            pq.add(i);
            if(pq.size() > k){
                list.add(pq.poll());
            }
        }

        while(pq.size() > 0){
            list.add(pq.poll());
        }

        return list;
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 4;
        System.out.println(sortArray(arr, k));
    }
}

//Output
//[20, 15, 10, 7, 4, 3]