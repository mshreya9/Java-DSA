class Fibonacci {
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

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
        int n = 4;
        System.out.println(fibM(n));
    }
}