class Solution {
    public static void main(String[] args) {
        int n = 5433231;
        int dig = 3;
		int count = 0;
		while(n > 0){
			int last = n % 10;
			if(last == dig){
				count++;
			}
			n /= 10;
		}
		System.out.println(count);
    }
}

//Output
//3