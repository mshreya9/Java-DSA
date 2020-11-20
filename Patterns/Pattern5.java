import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 2; col <= row; col++){
                System.out.print(" ");
            }
            for(int col = n; col >= row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Output (for n = 5)

// *****
//  ****
//   ***
//    **
//     *