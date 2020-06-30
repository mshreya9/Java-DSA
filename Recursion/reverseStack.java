//Do it without using another stack
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        reverse(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }

    static void reverse(Stack<Integer> s) {
        if(s.size() == 1){
            return;
        }
        int temp = s.peek();
        s.pop();
        reverse(s);
        insert(s, temp);
        return;
    }

    static void insert(Stack<Integer> s, int ele) {
        if(s.size() == 0){
            s.push(ele);
            return;
        }
        int temp = s.peek();
        s.pop();
        insert(s, ele);
        s.push(temp);
        return;
    }
}