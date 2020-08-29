class Solution {
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

    public static void printElement(int[] arr, int elem){
        int index = indexOfMinElem(arr);
        int n = arr.length;
        int x = binarySearch(arr, 0, index-1, elem);
        int y = binarySearch(arr, index, n-1, elem);
        if(x == -1 && y == -1){
            System.out.println("Element is not present!");
        }
        else if(x != -1){
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }
    }
    public static void main(String[] args) {
        int[] arr = {11,12,15,18,2,5,6,8};
        int elem = 15;
        printElement(arr, elem);
    }
}

//Output: 2