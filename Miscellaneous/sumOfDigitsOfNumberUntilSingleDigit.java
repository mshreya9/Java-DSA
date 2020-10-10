class Solution {
    public static void main(String args[]) {
        int n = 12345;
        System.out.println(digSum(n));
    }

    public static int digSum(int n){
        if(n == 0){
            return 0;
        }
        else if(n % 9 == 0){
            return 9;
        }
        else{
            return n % 9;
        }
    }
}

//Output: 6