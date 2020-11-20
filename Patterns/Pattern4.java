import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row; col++){
                System.out.print(" ");
            }
            for(int col = n-row+1; col <= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Output (for n = 5)

//     *
//    **
//   ***
//  ****
// *****