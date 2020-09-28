/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int index = peakIndex(mountainArr);
        int x = binarySearchAsc(mountainArr, 0, index-1, target);
        int y = binarySearchDesc(mountainArr, index, n-1, target);
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
    
    //Find peak index
    public int peakIndex(MountainArray arr){
        int start = 0;
        int end = arr.length() - 1;
                
        while(start < end) {
            int mid = start + (end - start) / 2;
            int midEl = arr.get(mid);
                        
            if( midEl > arr.get(mid+1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        
        return end;
    }
    
    //Binary Search Ascending
    public int binarySearchAsc( MountainArray mountainArr, int start, int end, int elem){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(elem == mountainArr.get(mid)){
                return mid;
            }
            else if(elem < mountainArr.get(mid)){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    
    //Binary Search Descending
    public int binarySearchDesc( MountainArray mountainArr, int start, int end, int elem){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(elem == mountainArr.get(mid)){
                return mid;
            }
            else if(elem < mountainArr.get(mid)){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}