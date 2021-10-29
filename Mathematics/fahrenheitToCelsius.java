/*
Take the following as input ->
Minimum Fahrenheit value
Maximum Fahrenheit value
Step

Print as output the Celsius conversions. Use the formula C = (5/9)(F – 32) E.g. for an input of 0, 100 and 20 the output is
0 -17
20 -6
40 4
60 15
80 26
100 37
*/

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int step = sc.nextInt();

		for(int f = min; f <= max; f+=step){
			int c = (5 * (f - 32))/9;
			System.out.println(f + " " + c);
		}
    }
}

/*
Sample Input
0 
100 
20

Sample Output
0 -17 
20 -6 
40 4 
60 15 
80 26 
100 37
*/