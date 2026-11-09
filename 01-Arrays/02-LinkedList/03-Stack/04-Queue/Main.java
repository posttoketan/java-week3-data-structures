import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Removed Element: " + queue.poll());

        System.out.println("Queue After Poll: " + queue);
    }
}
