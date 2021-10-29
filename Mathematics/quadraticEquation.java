//First line of the output contains nature of the roots.
//The next line contains roots in non-decreasing order.

class Solution {
    public static void main(String[] args) {
        int a = 1;
        int b = -11;
        int c = 28;

        double D = b*b - 4*a*c;
		double r1 = (-b + Math.sqrt(D)) / (2 * a);
		double r2 = (-b - Math.sqrt(D)) / (2 * a);

		if(D > 0){
			System.out.println("Real and Distinct");
			if(r1 < r2){
				System.out.println((int)r1 + " " + (int)r2);
			}
			else{
				System.out.println((int)r2 + " " + (int)r1);
			}
		}
		else if(D == 0){
			System.out.println("Real and Equal");
			System.out.println((int)r1 + " " + (int)r2);
		}
		else if(D < 0){
			System.out.println("Imaginary");
			// double real = -b / (2 * a);
			// System.out.println((int)real);
		}
    }
}

//Output

// Real and Distinct
// 4 7