class Solution {
    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length+arr2.length];
        int i = 0, j = 0, k = 0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                merged[k] = arr1[i];
                k++;
                i++;
            }
            else{
                merged[k] = arr2[j];
                k++;
                j++; 
            }
        }
        
        if(i == arr1.length){
            while(j < arr2.length){
                merged[k] = arr2[j];
                k++;
                j++; 
            }
        }
        
        if(j == arr2.length){
            while(i < arr1.length){
                merged[k] = arr1[i];
                k++;
                i++; 
            }
        }
        return merged;
    }

    public static int[] mergeSort(int[] arr, int lo, int hi){
        //Base Condition
        if(lo == hi){
            int[] br =new int[1];
            br[0] = arr[lo];
            return br;
        }

        int mid = (lo+hi)/2;
        int[] fh = mergeSort(arr, lo, mid);
        int[] sh = mergeSort(arr, mid+1, hi);

        int[] merge = mergeTwoSortedArrays(fh, sh);
        return merge;
    }
    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 50, 60, 5, 80, 25};
        int[] ans = mergeSort(arr, 0, arr.length-1);
        for(int val: ans){
            System.out.print(val + " ");
        }
    }
}

//Output: 5 10 20 25 30 50 60 80 