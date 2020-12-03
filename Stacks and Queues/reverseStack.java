import java.util.Stack;

public class reverseStack {
    public static void stackReverse(Stack<Integer> stack, Stack<Integer> helper, int index){
        if(stack.isEmpty()){
            return;
        }
        int item = stack.pop();
        stackReverse(stack, helper, index+1);
        helper.push(item);
        if(index == 0){
            while(!helper.isEmpty()){
                stack.push(helper.pop());
            }
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 1; i <= 5; i++){
            stack.push(i * 10);
        }
        Stack<Integer> helper = new Stack<>();
        stackReverse(stack, helper, 0);
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}

//Output: 
//10 20 30 40 50 