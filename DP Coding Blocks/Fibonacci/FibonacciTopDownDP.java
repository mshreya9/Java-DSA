import java.util.*;

public class FibonacciTopDownDP {
    public static int FibTD(int n, int[] strg){
        if(n == 0 || n == 1){
            return n;
        }

        if(strg[n] != 0){ //re use
            return strg[n];
        }

        int fnm1 = FibTD(n-1, strg);
        int fnm2 = FibTD(n-2, strg);
        int fn = fnm1+fnm2;

        strg[n] = fn; //store

        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FibTD(n, new int[n+1])); 
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n) + Recursion Extra Space (which is implicit)

// n = 10: Output: 55