
class Solution {
    public static int smallestNumber(int num){
        int[] freq = new int[10];
        while (num > 0) 
        { 
            int d = num % 10;  
            freq[d]++; 
            num = num / 10;
        } 

        int result = 0;
        for(int i = 1; i <= 9; i++){
            if(freq[i] != 0){
                result = i;
                freq[i]--;
                break;
            }
        }

        for(int i = 0 ; i <= 9 ; i++){
            while(freq[i]-- != 0){
                result = result * 10 + i; 
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int n = 7506;
        System.out.println(smallestNumber(n));
    }
}

//Output: 5067