class Solution {
    public boolean checkIfExist(int[] arr) {
        
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            for(int j = 0; j < arr.length; j++){
                if(i != j && arr[j] == 2 * temp && ((arr[j] > 0 && temp > 0) || (arr[j] < 0 && temp < 0))){
                    return true;
                }
                if(i != j && temp == 0 && arr[j] == 0){
                    return true;
                }
            }
        }
        return false;
    }
}