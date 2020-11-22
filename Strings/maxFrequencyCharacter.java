import java.util.Scanner;

public class maxFrequencyCharacter {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] arr = new int[26];
		for(int i = 0; i < s.length(); i++){
			arr[s.charAt(i) - 'a']++;
		}
		int max = Integer.MIN_VALUE;
		char result = ' ';
		for(int i = 0; i < s.length(); i++){
			if(arr[s.charAt(i) - 'a'] > max){
				max = arr[s.charAt(i) - 'a'];
				result = s.charAt(i);
			}
		}
		System.out.println(result);
    }
}

//Input: aaabacb
//Output: a