//ou are given a string, S, written in Camel Case. Find all the words contained in it.

class Solution {
    public static void main(String[] args) {
        String s = "IAmACompetitiveProgrammer";
		StringBuilder temp = new StringBuilder();
		for(int i = 0; i < s.length(); i++){
			temp.append(s.charAt(i));
			if(i == s.length()-1 || Character.isUpperCase(s.charAt(i+1))){
				System.out.println(temp.toString());
				temp.delete(0, temp.length());
			}
		}
    }
}

/*
Output ->
I
Am
A
Competitive
Programmer
*/
