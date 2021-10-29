class Solution {
    public static void main(String[] args) {
        int rows = 4;
		int count = 0, j = 0;
		for(int i = 0; i < rows;){
			System.out.print(fib(j));
			System.out.print(" ");
			count++;
			j++;
			if(count == i+1){
				System.out.println();
				count=0;
				i++;
			}
		}
    }

    public static int fib(int n){
		if(n == 0 || n == 1){
			return n;
		}
		int ans = fib(n-1) + fib(n-2);
		return ans;
	}
}

/*
Output (for n = 4)
0 
1 1
2 3 5
8 13 21 34
*/