import java.util.*;

public class BoardPathBottomUpSpaceEfficient {
    public static int BPBUSE(int end){
        int[] strg = new int[6];
        strg[0] = 1;
        for(int slide = 1; slide <= end; slide++){
            int sum = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];
            strg[5] = strg[4];
            strg[4] = strg[3];
            strg[3] = strg[2];
            strg[2] = strg[1];
            strg[1] = strg[0];

            strg[0] = sum;
        }
        
        return strg[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        System.out.println(BPBUSE(end)); 
    }
}

// TC : O(n)
// SC : O(1) Why? because it is independent of the value of n, doesn't matter how big the number n is, array would always be of size 6