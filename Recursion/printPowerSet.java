import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String ip = sc.nextLine();
        String op = "";
        solve(ip, op);
        
    }

    static void solve(String ip, String op) {
        if(ip.length() == 0){
            System.out.print(op + " ");
            return;
        }
        String op1 = op;
        String op2 = op;
        //Adding 0th index character
        char ch = ip.charAt(0);
        op2 = op2 + ch;
        //Erasing first index of input
        ip = ip.substring(1, ip.length());
        
        solve(ip, op1);
        solve(ip, op2);

        return;
    }
}