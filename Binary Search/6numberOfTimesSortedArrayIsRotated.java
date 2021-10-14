class Solution {
    public static int binarySearch(int[] arr){
        int n = arr.length;
        int start = 0, end = n-1;
        if(arr[0]<arr[n-1])
        {
            return 0;
        }

        while(start <= end){
            int mid = start + (end-start)/2;
            int next = (mid+1) % n;
            int prev = (mid+n-1) % n;

            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return n-mid;
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
    public static void main(String[] args) {
        int[] arr = {11,12,15,18,2,5,6,8};
        System.out.println(binarySearch(arr));
    }
}

//Output: 4