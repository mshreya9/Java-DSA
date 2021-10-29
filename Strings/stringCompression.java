//Take as input S, a string. 
//Write a function that does basic string compression. Print the value returned. E.g. for input "aaabbccds" print out a3b2c2ds.

class Solution {
    public static void main(String[] args) {
        String s = "aaabbccds";
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			count++;
			if(i == s.length()-1 || s.charAt(i+1) != s.charAt(i)){
				if(count == 1){
					sb.append(s.charAt(i));
				}
				else{
					sb.append(s.charAt(i));
					sb.append(count);
				}
				
				count = 0;
			}
		}
		System.out.println(sb.toString());
    }
}

//Output
//a3b2c2ds