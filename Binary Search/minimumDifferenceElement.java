class Solution {
    public static int binarySearch(int[] arr, int elem){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(elem == arr[mid]){
                return 0;
            }
            else if(elem < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        int x = Math.abs(arr[start] - elem);
        int y = Math.abs(arr[end] - elem);
        return Math.min(x,y);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,8,10,15};
        int elem = 12;
        System.out.println(binarySearch(arr, elem));
    }
}

//Output: 2
//Minimum of (15-12) and (10-12) = min of (2) and (3) = 2