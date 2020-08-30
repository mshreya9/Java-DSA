class Solution {
    public static int floorOfElement(int[] arr, int elem){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int res = 0;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(elem == arr[mid]){
                return mid;
            }
            else if(elem < arr[mid]){
                res = arr[mid];
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,10,10,12,19};
        int elem = 5;
        System.out.println(floorOfElement(arr, elem));
    }
}

//Output: 8