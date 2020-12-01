import java.util.*;

public class checkSubarrayWithSumZero {
    public static boolean sumZero(int[] arr){
        HashMap<Integer, Boolean> map = new HashMap<>();
        int prefixSum = 0;
        for(int i = 0; i < arr.length; i++){
            prefixSum = prefixSum + arr[i];
            if(prefixSum == 0 || map.containsKey(prefixSum)){
                return true;
            }
            else{
                map.put(prefixSum, true);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 3, -5, -8, 9, -1 };
        System.out.println(sumZero(arr));
    }
}

//Output
//true