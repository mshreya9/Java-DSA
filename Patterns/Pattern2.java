import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

//Output (for n = 5)

// * 
// * *
// * * * 
// * * * *
// * * * * *