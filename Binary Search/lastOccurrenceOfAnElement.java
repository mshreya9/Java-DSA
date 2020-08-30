class Solution {
    public static int lastOccurrence(int[] arr, int elem){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int res = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(elem == arr[mid]){
                res = mid;
                start = mid + 1;
            }
            else if(elem < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int elem = 10;
        System.out.println(lastOccurrence(arr, elem));
    }
}

//Output: 4