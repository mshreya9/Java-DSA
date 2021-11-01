import java.util.*;

class MinimumCountSquares {
    public static int countSquares(int n){
        if(n <= 3){
            return n;
        }
        int res = n; //maximum count would be the number itself
        int i = 1;
        while(i < Math.sqrt(n)){
            int op = (int)Math.pow(i, 2);
            res = Math.min(res, 1 + countSquares(n - op));
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        sc.close();
        System.out.println(countSquares(n));
    }
}