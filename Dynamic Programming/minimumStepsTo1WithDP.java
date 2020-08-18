class MinimumSteps {
    public static int countStepsDP(int n){
        int[] storage = new int[n+1];
        storage[1] = 0;
        for(int i = 2; i <= n; i++){
            int min = storage[i - 1];
            if(i % 3 == 0){
                if(min > storage[i / 3]){
                    min = storage[i / 3];
                }
            }
            if(i % 2 == 0){
                if(min > storage[i / 2]){
                    min = storage[i / 2];
                }
            }
            storage[i] = 1 + min; 
        }
        return storage[n];
    }
    
    public static void main(String[] args){
        int n = 100;
        System.out.println(countStepsDP(n));
    }
}

//Output
//7