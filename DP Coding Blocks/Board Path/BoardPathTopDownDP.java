import java.util.*;

public class BoardPathTopDownDP {
    public static int BPTD(int curr, int end, int[] strg){
        if(curr == end){
            return 1;
        }

        if(curr > end){
            return 0;
        }

        if(strg[curr] != 0){ //re-use
            return strg[curr];
        }

        int count = 0;
        for(int dice = 1; dice <= 6; dice++){
            count += BPTD(curr+dice, end, strg);
        }

        strg[curr] = count; //store

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        System.out.println(BPTD(0, end, new int[end]));
    }
}

// TC : O(n)
// SC : O(n) + Recursion Extra Space

// end = 10 -> output: 492
