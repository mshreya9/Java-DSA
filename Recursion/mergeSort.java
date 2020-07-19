import java.util.Arrays;

class Solution {

    public static void mergeSort(int[] input) {
        if (input.length <= 1) {
            return;
        }
        int mid = input.length / 2;
        int part1[] = new int[mid];
        int part2[] = new int[input.length - mid];
        for (int i = 0; i < mid; i++) {
            part1[i] = input[i];
        }
        int k = 0;
        for (int i = mid; i < input.length; i++) {
            part2[k] = input[i];
            k++;
        }
        mergeSort(part1);
        mergeSort(part2);
        merge(part1, part2, input);

    }

    public static void merge(int[] input1, int input2[], int[] output) {

        int i = 0, j = 0, k = 0;
        while (i < input1.length && j < input2.length) {
            if (input1[i] < input2[j]) {
                output[k++] = input1[i++];
            } else {
                output[k++] = input2[j++];
            }
        }
        while (i < input1.length) {
            output[k] = input1[i];
            k++;
            i++;
        }
        while (j < input2.length) {
            output[k] = input2[j];
            j++;
            k++;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);
        Solution.mergeSort(arr);

        System.out.println("Sorted array");
        printArray(arr);
    }

}
