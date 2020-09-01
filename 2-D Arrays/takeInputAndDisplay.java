import java.util.Scanner;

public class wavePrint {
    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        sc.close();
        int[][] arr = new int[rows][];

        for(int i = 0; i < rows; i++){
            System.out.println("Enter number of columns for row " + i);
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            for(int j = 0; j < cols; j++){
                System.out.println("Enter the value for row " + i + " and col " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void display(int[][] arr){
	    for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}
    public static void main(String[] args) {
        int[][] arr = takeInput();
        display(arr);
    }
}