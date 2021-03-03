import java.util.*;

public class FibBottomUpSpaceEfficient {
    public static int FibBUSpaceEfficient(int n){
        int[] strg = new int[2];
        strg[0] = 0;
        strg[1] = 1;
        for(int slide = 1; slide <= n-1; slide++){
            int sum = strg[0] + strg[1];
            strg[0] = strg[1];
            strg[1] = sum;
        }
        return strg[1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FibBUSpaceEfficient(n)); 
    }
}

// TC = O(n)
// SC = O(1)

// We can also solve this question by taking two variables, instead of taking an array of size 2.

// n = 12 : Output: 144