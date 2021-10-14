class Solution {
    public static Character ceilOfChar(char[] arr, char key){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        char res = 0;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(key == arr[mid]){
                start = mid+1;
            }
            else if(key < arr[mid]){
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
        char[] arr = {'a','c','f','h'};
        char key = 'f';
        System.out.println(ceilOfChar(arr, key));
    }
}

//Output: h