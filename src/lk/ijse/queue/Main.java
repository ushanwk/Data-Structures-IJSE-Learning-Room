package lk.ijse.queue;

public class Main {

    public static void main(String[] args) {

        Queue queue = new Queue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        queue.printQueue();

        queue.deQueue();

        queue.printQueue();

        System.out.println(queue.peek());

    }

}
