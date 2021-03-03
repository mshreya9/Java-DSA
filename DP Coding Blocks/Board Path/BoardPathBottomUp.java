import java.util.*;

public class BoardPathBottomUp {
    public static int BPBU(int end){
        int[] strg = new int[end+6];
        strg[end] = 1;
        for(int i = end-1; i >= 0; i--){
            strg[i] = strg[i+1] + strg[i+2] + strg[i+3] + strg[i+4] + strg[i+5] + strg[i+6];
        }

        return strg[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        System.out.println(BPBU(end));
    }
}

// TC : O(n)
// SC : O(n)

// end = 10 -> Output: 492