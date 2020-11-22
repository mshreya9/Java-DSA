import java.util.Scanner;

public class isPalindrome {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isStringPalindrome(s));
    }

	public static boolean check(String s, int start, int end){
        if(start >= end){
            return true;
        }
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        return check(s, start + 1, end - 1);
    }

	public static boolean isStringPalindrome(String input) {
        return check(input, 0, input.length() - 1);
	}
}