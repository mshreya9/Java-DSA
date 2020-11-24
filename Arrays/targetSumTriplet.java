/*Question:
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all triplets of numbers which sum to target.

Output Format
Print all the triplet present in the array in a new line each. The triplets must be printed as A, B and C where A,B and C are the elements of the triplet ( A<=B<=C) and all triplets must be printed in sorted order. Print only unique triplets.

Sample Input
9
5 7 9 1 2 4 6 8 3
10
Sample Output
1, 2 and 7
1, 3 and 6
1, 4 and 5
2, 3 and 5
*/

import java.util.*;

public class targetSumTriplet {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();

		Arrays.sort(arr);
		for(int i = 0; i < n-1; i++){
			int temp = arr[i];
			int newtarget = target - temp;
			int l = i+1;
			int r = n-1;
			while(l < r){
				if(arr[l] + arr[r] == newtarget){
					System.out.println(temp + ", " + arr[l] + " and " + arr[r]);
					l++;
					r--;
				}
				else if(arr[l] + arr[r] > newtarget){
					r--;
				}
				else{
					l++;
				}
			}
		}
    }
}