//Ques: Take as input S, a string. Write a program that inserts between each pair of characters
//the difference between their ascii codes and print the answer.

import java.util.Scanner;

public class differenceInASCII {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length()-1; i++){
			sb.append(s.charAt(i));
			int diff = s.charAt(i+1) - s.charAt(i);
			sb.append(diff);
		}
		sb.append(s.charAt(s.length()-1));
		System.out.println(sb.toString());
    }
}

//Input: acb
//Output: a2c-1b
