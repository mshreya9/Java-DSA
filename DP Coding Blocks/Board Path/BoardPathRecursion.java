//Question - How many ways are possible to reach the end by throwing a dice?

import java.util.*;

public class BoardPathRecursion {
    public static int BPRecursion(int curr, int end){
        if(curr == end){
            return 1;
        }

        if(curr > end){
            return 0;
        }

        int count = 0;
        for(int dice = 1; dice <= 6; dice++){
            count += BPRecursion(curr+dice, end);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        System.out.println(BPRecursion(0, end)); 
    }
}

// TC : O(6 to the power n)

//end = 3 -> Output: 4

// How? 
// 1 1 1
// 1 2
// 2 1
// 3 

// if n = 10 -> Output: 492 ways
