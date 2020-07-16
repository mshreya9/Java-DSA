class Solution {
    private static boolean checkSortedBetter(int input[], int startIndex){
        if(startIndex >= input.length-1){
            return true;
        }
        if(input[startIndex] > input[startIndex + 1]){
            return false;
        }
        boolean smallAns = checkSortedBetter(input, startIndex + 1);
        return smallAns;
    }

    public static boolean checkSortedBetter(int input[]){
        return checkSortedBetter(input, 0);
    }

    public static void main(String[] args) {
        int input[] = {1,2,3};
        System.out.println(checkSortedBetter(input));
    }
}

//Imp points
//This is a better approach because we are saving time and space both. We are not creating small array each time in the recursive call.
//Also, to help user not pass the startIndex when calling a function we write the above code by creating another function.