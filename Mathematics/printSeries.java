//Write a function to print first N1 terms of the series 3n + 2 which are not multiples of N2.

class Solution {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 4;
        int i = 1;
		int count = 0;
		while(count != n1){
			int n = 3*i + 2;
			if(n % n2 != 0){
				count++;
				System.out.println(n);
			}
			i++;
		}
    }
}

/*
Output
5 
11 
14 
17 
23 
26 
29 
35 
38 
41
*/