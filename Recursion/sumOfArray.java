class Solution {
    public static int sumArray(int input[]){
        if(input.length == 1){
            return input[0];
        }

        int smallInput[] = new int[input.length-1];
        for(int i = 1; i < input.length; i++){
            smallInput[i-1] = input[i];
        }
        int sum = 0;
        for(int i = 0; i < smallInput.length; i++){
            sum = sum + smallInput[i];
        }
        return input[0] + sumArray(smallInput);
    }

    public static void main(String[] args) {
        int input[] = {1,2,3};
        System.out.println(sumArray(input));
    }
}

//Output: 6