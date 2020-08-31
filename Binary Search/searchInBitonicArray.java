class Solution {
    public static int binarySearch(int[] arr, int start, int end, int key){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(key == arr[mid]){
                return mid;
            }
            else if(key < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int maxElement(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid > 0 && mid < n-1){
                if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                    return mid;
                }
                else if(arr[mid-1] > arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(mid == 0){
                if(arr[0] > arr[1]){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            else if(mid == n-1){
                if(arr[n-1] > arr[n-2]){
                    return n-1;
                }
                else{
                    return n-2;
                }
            }
        }
        return -1;
    }

    public static void searchInBitoniArray(int[] arr, int key){
        int n = arr.length;
        int index = maxElement(arr);
        int x = binarySearch(arr, 0, index-1, key);
        int y = binarySearch(arr, index, n-1, key);

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
        int[] arr = {1,3,8,12,4,2};
        int key = 4;
        searchInBitoniArray(arr, key);
    }
}

//Output: 4