/*A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if.
abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….
For eg.
1634 is an Armstrong number as 1634 = 1^4 + 6^4 + 3^4 + 4^4
371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3
*/

class Solution {
    public static void main(String[] args) {
        int n = 371;

        int noDig = order(n);
		int sum = 0;
		int temp = n;
		while(temp > 0){
			int last = temp % 10;
			sum += Math.pow(last, noDig);
			temp /= 10;
		}
		if(sum == n){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
    }

    public static int order(int n){
		int count = 0;
		while(n > 0){
			count++;
			n /= 10;
		}
		return count;
	}
}

//Output
//true