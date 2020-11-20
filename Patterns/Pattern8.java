import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for(i = n; i >= 1; i--){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= (2 * i - 1); j++){
                if(j == 1 || j == (2 * i - 1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(i = 2; i <= n; i++){
            for(j = i; j < n; j++){
                System.out.print(" ");
            }

            for(j = 1; j <= (2 * i - 1); j++){
                if(j == 1 || j == (2 * i - 1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//Output (for n = 5)

// *       *
//  *     *
//   *   *
//    * *
//     *
//    * *
//   *   *
//  *     *
// *       *