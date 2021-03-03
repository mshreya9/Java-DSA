import java.util.*;

public class FibonacciUsingRecursion {
    public static int FibRecursion(int n){
        //Base Case
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = FibRecursion(n-1);
        int fnm2 = FibRecursion(n-2);
        int fn = fnm1+fnm2;;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FibRecursion(n)); 
    }
}

// Time Complexity: O(2 to the power n)
// Recursion solution would give Time Limit Exceeded for larger values of n
// Exponential time complexity has to be improved and for which we write down the DP solution, since there are overlapping sub problems.

// Output : 5
