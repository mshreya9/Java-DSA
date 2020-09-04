class Solution {
    public static void quickSort(int[] arr, int lo, int hi){
        //Base Condition
        if(lo >= hi){
            return;
        }

        //Partitioning
        int mid = (lo + hi)/2;
        int pivot = arr[mid];
        int left = lo;
        int right = hi;

        while(left <= right){
            while(arr[left] < pivot){
                left++;
            }
            while(arr[right] > pivot){
                right--;
            }
            if(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        //Smaller problems
        quickSort(arr, lo, right);
        quickSort(arr, left, hi);
    }
    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 50, 60, 5, 80, 25};
        quickSort(arr, 0, arr.length-1);
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}

//Output: 5 10 20 25 30 50 60 80 