import java.util.*;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countZeros(n));
    }

    public static int countZeros(int input){
        if(input < 10){
			if(input == 0)
				return 1;
			else
				return 0;
		}
		if(input % 10 == 0){
			return countZeros(input/10)+1;
		}
		else
			return countZeros(input/10);
    }
}