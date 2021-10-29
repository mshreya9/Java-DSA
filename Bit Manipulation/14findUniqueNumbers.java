//All the numbers in the array are present twice except for two numbers which are present only once. 
//Find the unique numbers in linear time without using any extra space. 

class Solution {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {3,1,2,1};

        int xor = 0;
		for(int i = 0; i < n; i++){
			xor ^= arr[i]; //xor of two non repeating elements
		}

		//imp step (get the rightmost set bit in xor by doing bitwise &)
		xor = (xor & -xor);

		int xor1 = 0;
        int xor2 = 0;

		for(int i = 0; i < n; i++){
            if((arr[i] & xor) > 0){
                xor1 ^= arr[i];
            }
            else{
                xor2 ^= arr[i];
            }
		}

		System.out.println(xor1 + " and " + xor2);
    }
}

//Output
//3 and 2