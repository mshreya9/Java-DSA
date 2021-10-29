import java.util.*;

class Solution {
    public static void main(String[] args) {
        int low = 1, high = 10;
        int[] arr = {1,3,5,4};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        for (int i = low; i <= high; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

//Output
//2 6 7 8 9 10 