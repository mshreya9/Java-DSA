class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int index = indexOfMinElem(nums);
        int x = binarySearch(nums, 0, index-1, target);
        int y = binarySearch(nums, index, n-1, target);
        if(x == -1 && y == -1){
            return -1;
        }
        else if(x != -1){
            return x;
        }
        else{
            return y;
        }
    }
    
    //Find index of min element
    public static int indexOfMinElem(int[] arr){
        int n = arr.length;
        int start = 0, end = n-1;
        if(arr[0] < arr[n-1]){
            return 0;
        }

        while(start <= end){
            int mid = start + (end-start)/2;
            int next = (mid+1) % n;
            int prev = (mid+n-1) % n;

            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }

            else if(arr[mid] <= arr[end]){
                end = mid - 1;
            }
            else if(arr[start] <= arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
    
    //Binary Search
    public static int binarySearch(int[] arr, int start, int end, int elem){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(elem == arr[mid]){
                return mid;
            }
            else if(elem < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}