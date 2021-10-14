class Solution {
    public static int searchInNearlySortedArray(int[] arr, int elem){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(elem == arr[mid]){
                return mid;
            }
            if(mid-1 >= start && elem == arr[mid-1]){
                return mid-1;
            }
            if(mid+1 <= end && elem == arr[mid+1]){
                return mid+1;
            }
            else if(elem < arr[mid]){
                end = mid - 2;
            }
            else{
                start = mid + 2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,10,30,20,40};
        int elem = 20;
        System.out.println(searchInNearlySortedArray(arr, elem));
    }
}

//Output: 3