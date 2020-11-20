import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i, j; 
        for(i = 1; i <= n; i++){ 
            for(j = 1; j <= n; j++){ 
                if(i == 1 || i == n || j == 1 || j == n){         
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

// *****
// *   *
// *   *
// *   *
// *****