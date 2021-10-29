class Solution {
    public static void main(String[] args) {
		char ch = 's';
		if(ch <= 'z' && ch >= 'a'){
			System.out.println("Lowercase");
		}
		else if(ch <= 'Z' && ch >= 'A'){
			System.out.println("Uppercase");
		}
		else{
			System.out.println("Invalid");
		}
    }
}

//Output
//Lowercase