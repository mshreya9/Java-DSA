class Solution {
    public static boolean isPrime(int n){ 
        if(n <= 1){
            return false; 
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        } 
        return true; 
    } 

    public static int prime(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i = 2; i < n; i++){
            if(isPrime(i)){
                //System.out.println(arr[i]);
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String args[]) {
        int[] arr = {9,4,7,12,11,5};
        System.out.println(prime(arr));
    }

}

//Output: 24 (7+12+5)