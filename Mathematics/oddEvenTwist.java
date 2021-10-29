//The scheme is as follows, each car will be allowed to run on Sunday if the sum of digits which are even is divisible by 4 OR sum of digits which are odd in that number is divisible by 3.

class Solution {
    public static void main(String[] args) {
        int n = 12345;
        boolean ans = evenOddDig(n);
        if(ans){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static boolean evenOddDig(int n){
		int sumEven = 0, sumOdd = 0;
		while(n > 0){
			int last = n % 10;
			if(last % 2 == 0){
				sumEven += last;
			}
			else if(last % 2 != 0){
				sumOdd += last;
			}
			n /= 10;
		}
		if((sumEven % 4 == 0) || (sumOdd % 3 == 0)){
			return true;
		}
		return false;
	}
}

//Output
//Yes