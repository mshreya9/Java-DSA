//All the numbers in the array are present twice except for one number which is only present once. 
//Find the unique number without taking any extra spaces and in linear time.

class Solution {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,3,2,1,3,4};

        int xor = arr[0];
		for(int i = 1; i < n; i++){
			xor ^= arr[i];
		}
		System.out.println(xor);
    }
}

//Output
//4