class Fibonacci {
    public static int fibDP(int n){
        int storage[] = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;

        for(int i = 2; i <= n; i++){
            storage[i] = storage[i-1] + storage[i-2];
        }

        return storage[n];
    }

    public static void main(String[] args){
        int n = 10;
        System.out.println("The 10th fibonacci number is: " + fibDP(n-1));
    }
}

//The Fibonacci series upto 10 elements is: 0 1 1 2 3 5 8 13 21 34

//output:
//The 10th fibonacci number is: 34