//Find the first negative integer in window of size k

import java.util.*;

public class firstNegativeInteger {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        LinkedList<Integer> queue = new LinkedList<>();
        int i;
        for(i = 0; i < k; i++){
            if(arr[i] < 0){
                queue.addLast(i);
            }
        }

        for(; i < arr.length; i++){
            if(!queue.isEmpty()){
                System.out.println(arr[queue.peek()]);
            }
            else{
                System.out.println("0");
            }

            while(!queue.isEmpty() && queue.peek() <= i-k){
                queue.removeFirst();
            }
            if(arr[i] < 0){
                queue.addLast(i);
            }
        }

        if(!queue.isEmpty()){
            System.out.println(arr[queue.peek()]);
        }
        else{
            System.out.println("0");
        }
    }
}

//Output

// -1
// -1
// -7
// -15
// -15
// 0