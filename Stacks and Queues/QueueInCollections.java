import java.util.LinkedList;
import java.util.Queue;

public class QueueInCollections {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.peek();
        System.out.println(queue.size());
        System.out.println(queue.poll());
    }
}

//Queue is an interface (use LinkedList class as it has implemented this interface already for us)
//peek method gives the front
//poll method deletes the front