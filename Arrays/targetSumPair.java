/*Question
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.
Output Format
Print all the pairs of numbers which sum to target. Print each pair in increasing order.
Sample Input
5
1
3
4
2
5
5
Sample Output
1 and 4
2 and 3
*/


import java.util.*;

public class targetSumPair {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
        int target = sc.nextInt();
        
		Arrays.sort(arr);
		int l = 0, r = n-1;
		while(l < r){
			if(arr[l] + arr[r] == target){
				System.out.println(arr[l] + " and " + arr[r]);
				l++;
				r--;
			}
			else if(arr[l] + arr[r] < target){
				l++;
			}
			else{
				r--;
			}
		}
    }
}