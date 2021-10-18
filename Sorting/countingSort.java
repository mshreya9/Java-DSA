class Main {
    public static void main(String args[]) {
		int n = 6;
		int[] arr = {2,7,6,9,4,1};

		int[] output = new int[n + 1];

		// Find the largest element of the array
		int max = arr[0];
		for(int i = 1; i < n; i++){
			if(arr[i] > max)
				max = arr[i];
		}
		int[] count = new int[max + 1];

		// Initialize count array with all zeros.
		for(int i = 0; i < max; ++i){
			count[i] = 0;
		}

		// Store the count of each element
		for(int i = 0; i < n; i++){
			count[arr[i]]++;
		}

		// Store the cummulative count of each array
		for(int i = 1; i <= max; i++){
			count[i] += count[i - 1];
		}

		// Find the index of each element of the original array in count array, and
		// place the elements in output array
		for(int i = n - 1; i >= 0; i--){
			output[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}

		// Copy the sorted elements into original array
		for(int i = 0; i < n; i++){
			arr[i] = output[i];
		}

		//ans output
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
    }
}

//Output:
// 1 2 4 6 7 9 