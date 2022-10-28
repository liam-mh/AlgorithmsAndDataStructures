public class Main {

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();

        System.out.println("Circular Queue");
        System.out.println("--------------");

        // Fails because front = -1
        q.deleteQ();

        q.addQ(1);
        q.addQ(2);
        q.addQ(3);
        q.addQ(4);
        q.addQ(5);

        // Fails to enqueue because front == 0 && rear == SIZE - 1
        q.addQ(6);

        q.display();

        int elem = q.deleteQ();

        if (elem != -1) {
            System.out.println("Deleted Element is " + elem);
        }
        q.display();

        q.addQ(7);

        q.display();

        // Fails to enqueue because front == rear + 1
        q.addQ(8);
    }
}
