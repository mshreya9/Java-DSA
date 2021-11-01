public class fibonacciWithRecursion {
    public static int fibRecursion(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibRecursion(n-1) + fibRecursion(n-2);
    }

    public static void main(String[] args){
        int n = 10;
        System.out.println("The 10th fibonacci number is: " + fibRecursion(n-1));
    }
}

//The Fibonacci series upto 10 elements is: 0 1 1 2 3 5 8 13 21 34

//output:
//The 10th fibonacci number is: 34