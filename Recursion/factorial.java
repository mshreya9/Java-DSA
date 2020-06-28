import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(Factorial(n));
    }

    static int Factorial(int n) {
        if(n == 0 || n == 1){
            return 1;
        }

        return n * Factorial(n-1);
    }
}
