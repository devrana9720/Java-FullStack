public class Implementation_by_array {

    int[] queue;
    int front;
    int rear;
    int size;

    // Constructor
    public Implementation_by_array(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue: Add element
    public void enqueue(int value) {

        if (size == queue.length) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
    }

    // Dequeue: Remove element
    public int dequeue() {

        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = queue[front];

        front = (front + 1) % queue.length;
        size--;

        return value;
    }

    // Peek: See front element
    public int peek() {

        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    // Check whether queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check whether queue is full
    public boolean isFull() {
        return size == queue.length;
    }

    // Main method
    public static void main(String[] args) {

        Implementation_by_array q =
                new Implementation_by_array(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Front: " + q.peek());

        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());

        System.out.println("Front: " + q.peek());

        q.enqueue(50);
        q.enqueue(60);

        System.out.println("Front: " + q.peek());

        System.out.println("Is Empty: " + q.isEmpty());
        System.out.println("Is Full: " + q.isFull());
    }
}