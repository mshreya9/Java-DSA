class MinimumSteps {
    //Brute force - recursion
    public static int countSteps(int n){
       if(n == 1){
           return 0;
       }
       int op1 = countSteps(n - 1);
       int minSteps = op1;
       if(n % 3 == 0){
           int op2 = countSteps(n / 3);
           if(op2 < minSteps){
               minSteps = op2;
           }
       }
       if(n % 2 == 0){
           int op3 = countSteps(n / 2);
           if(op3 < minSteps){
               minSteps = op3;
           }
       }
       return 1 + minSteps; 
    }

    public static int countStepsM(int n){
        int[] storage = new int[n+1];
        return countStepsM(n, storage);
    }
    public static int countStepsM(int n, int[] storage){
        if(n == 1){
            storage[n] = 0;
            return storage[n];
        }
        if(storage[n] != 0){ //check if it is already calculated or not
            return storage[n];
        }

        int op1 = countStepsM(n - 1, storage);
        int minSteps = op1;
        if(n % 3 == 0){
            int op2 = countStepsM(n / 3, storage);
            if(op2 < minSteps){
                minSteps = op2; 
            }
        }
        if(n % 2 == 0){
            int op3 = countStepsM(n / 2, storage);
            if(op3 < minSteps){
                minSteps = op3;
            }
        }
        storage[n] = 1 + minSteps;
        return storage[n]; 
    }

    public static void main(String[] args){
        int n = 10;
        System.out.println(countStepsM(n));
        System.out.println(countSteps(n));
    }
}