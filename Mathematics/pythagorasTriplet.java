class Solution {
    public static void main(String[] args) {
        long n = 3;
        if (n < 3){
        	System.out.println("-1");
		}
		else if(n % 2 == 0){
			long value = ((n * n) / 4) - 1;
            long value1 = ((n * n) / 4) + 1;
            System.out.println(value + " " + value1);
		}
		else{
			long value = (n * n - 1) / 2;
            long value1 = (n * n + 1) / 2;
            System.out.println(value + " " + value1);
		}
    }
}

//Output
//4 5

//For input n = 6 -> Output => 8 10