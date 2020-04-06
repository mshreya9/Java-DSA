// Problem-10 :- Rearrange Sorted Array in Min/Max Form
// Re-arrange the elements of a sorted array in such a way that the first position will have the largest number,
//the second will have the smallest, the third will have the second largest, and so on.

import java.util.*;

class MinMax {
    public static void rearrange(int arr[], int n) {
        int[] temp = new int[n];
        int small = 0, large = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag == true) {
                temp[i] = arr[large--];
            } else {
                temp[i] = arr[small++];
            }
            flag = !flag;
        }
        // copy temp array to arr
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int n = 11;
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        MinMax.rearrange(arr, n);
    }
}