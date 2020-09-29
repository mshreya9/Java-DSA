class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }
    
    public void quickSort(int[] arr, int lo, int hi){
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
}