package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        queue.forEach(s -> {
            System.out.println(s);
        });

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.remove());

    }
}
