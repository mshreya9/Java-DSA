class Solution {
    public static void main(String[] args) {
        int[] arr = {1,1,0,2,1,0,2};

        int low = 0, mid = 0, high = arr.length-1;
        while(mid <= high){
            if(arr[mid] == 0){
                //swap elements at low and mid index
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid]= temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                //swap elements at mid and high index
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}