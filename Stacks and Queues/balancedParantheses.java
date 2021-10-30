//You are given a string of brackets i.e. '{', '}' , '(' , ')', '[' , ']' . You have to check whether the sequence of parenthesis is balanced or not.
//For example, "(())", "(())()" are balanced and "())(", "(()))" are not.

import java.util.*;

class Solution {
    public static void main(String[] args) {
        String str = "(())()";
        Stack<Character> stack = new Stack<>();
		if(isBalanced(str, stack)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
    }

    public static boolean isBalanced(String str, Stack<Character> stack){
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
                stack.push(str.charAt(i));
			}
			else if(!stack.isEmpty() && ((str.charAt(i) == ']' && stack.peek() == '[') || 
                        (str.charAt(i) == '}' && stack.peek() == '{') ||
                        (str.charAt(i) == ')' && stack.peek() == '('))){
 
                stack.pop();
            } 
			else{
				stack.push(str.charAt(i));
			}
		}

		if(stack.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
}

//Output
//Yes