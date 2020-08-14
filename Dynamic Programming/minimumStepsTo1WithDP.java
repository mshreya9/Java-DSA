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

    
    public static void main(String[] args){
        int n = 10;
        System.out.println(countSteps(n));
    }
}