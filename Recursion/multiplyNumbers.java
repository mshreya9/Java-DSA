import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(multiplyRecursively(n, m));
    }

    public static int multiplyRecursively(int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }

        return n + multiplyRecursively((n), m-1);
    }
    
}

//4*3 = 4+4+4 = 12 (logic : adding 4 for 3 times)