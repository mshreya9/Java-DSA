import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    public static sum(int input){
        if(input < 1){
            return 0;
        }
        return input%10 + sumOfDigits(input/10);
    }
}