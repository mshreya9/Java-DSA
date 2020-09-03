class Solution {
    public static void selectionSort(int[] arr) {
        for (int counter = 0; counter < arr.length - 1; counter++) {
            int min = counter;
            for (int j = counter+1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[counter];
            arr[counter] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {88, 11, 44, 99, 55};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}