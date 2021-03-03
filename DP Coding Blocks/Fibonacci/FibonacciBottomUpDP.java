import java.util.*;

public class FibonacciBottomUpDP {
    public static int FibBU(int n){
        int[] strg = new int[n+1];
        strg[0] = 0;
        strg[1] = 1;

        for(int i = 2; i <= n; i++){
            strg[i] = strg[i-1] + strg[i-2];
        }

        return strg[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FibBU(n)); 
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)

//n = 20 : Output: 6765