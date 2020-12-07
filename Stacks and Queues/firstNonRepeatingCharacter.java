import java.util.*;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        while(ch != '.'){
            queue.add(ch);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch, 1);
            }

            while(!queue.isEmpty()){
                char fc = queue.peek();
                if(map.get(fc) == 1){
                    System.out.println(fc);
                    break;
                }
                else{
                    queue.poll();
                }
            }

            if(queue.isEmpty()){
                System.out.println("-1");
            }

            ch = sc.next().charAt(0);
        }
    }
}
