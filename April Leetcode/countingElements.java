class Solution {
    public int countElements(int[] arr) {
        int count = 0, i , j, num;
        for(i = 0; i < arr.length; i++){
            num = arr[i] + 1;
            for(j = 0; j < arr.length; j++){
                if(arr[j] == num){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}