class fibonacciWithMemoization {
    public static int fibM(int n){
        int[] storage = new int[n+1];
        for(int i = 0; i <=n; i++){
            storage[i] = -1;
        }
        return fibM(n, storage);
    }

    public static int fibM(int n, int[] storage){
        if(n == 0 || n == 1){
            storage[n] = n;
            return storage[n];
        }
        if(storage[n] != -1){
            return storage[n];
        }
        storage[n] = fibM(n-1, storage) + fibM(n-2, storage);
        return storage[n];
    }

    public static void main(String[] args){
        int n = 10;
        System.out.println("The 10th fibonacci number is: " + fibM(n-1));
    }
}

//The Fibonacci series upto 10 elements is: 0 1 1 2 3 5 8 13 21 34

//output:
//The 10th fibonacci number is: 34