// Problem -1 :- Remove Even Integers from Array

import java.util.*;

class CheckRemoveEven {

	public static void removeEven(int[] arr) {

		int codd = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 != 0){
				codd++;
			}
		}
		int[] newArray = new int[codd];
		int newArrayIndex = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 != 0){
				newArray[newArrayIndex++] = arr[i];
			}
		}
        System.out.println(Arrays.toString(newArray));
    }
    
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 10, 6, 3};
        CheckRemoveEven.removeEven(arr);
    }
}