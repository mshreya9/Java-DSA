import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        Print(n);
    }

    static void Print(int n) {
        if(n == 1){
            System.out.print(n + " ");
            return;
        }

        Print(n-1);
        System.out.print(n + " ");
    }
}