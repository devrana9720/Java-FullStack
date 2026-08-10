public class Implementation_by_linkedlist {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    // Enqueue: Add element at rear
    public void enqueue(int value) {

        Node newNode = new Node(value);

        // If queue is empty
        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue: Remove element from front
    public int dequeue() {

        // If queue is empty
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = front.data;

        front = front.next;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }

        return value;
    }

    // Peek: See front element
    public int peek() {

        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }

    // Check whether queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Main method
    public static void main(String[] args) {

        Implementation_by_linkedlist q =
                new Implementation_by_linkedlist();

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
    }
}


/*
====================================================================
             QUEUE: ARRAY vs LINKED LIST
====================================================================

| Feature              | Array Queue              | Linked List Queue      |
|----------------------|--------------------------|------------------------|
| Memory               | Contiguous               | Non-contiguous         |
| Size                 | Fixed in basic version   | Dynamic                |
| Enqueue              | O(1)                     | O(1)                   |
| Dequeue              | O(1)                     | O(1)                   |
| Peek                 | O(1)                     | O(1)                   |
| Overflow             | Possible when full       | Only when memory full  |
| Extra Memory         | Less                     | More (next reference)  |
| Implementation       | Simpler                  | Slightly complex       |

====================================================================

ADVANTAGES OF ARRAY QUEUE
-------------------------
1. Simple implementation.
2. Less memory overhead.
3. Better cache locality because elements are stored
   in contiguous memory.
4. Good when maximum queue size is known.

DISADVANTAGES OF ARRAY QUEUE
----------------------------
1. Fixed capacity in a basic implementation.
2. Queue Overflow when the array is full.
3. Resizing is required for a dynamically growing queue.

IMPORTANT:
Use a CIRCULAR ARRAY for an array-based queue.
It reuses empty positions created after dequeue().

Example:

[ ][ ][30][40][50]
         ↑      ↑
       front   rear

The rear can wrap around to the beginning.


ADVANTAGES OF LINKED LIST QUEUE
-------------------------------
1. Dynamic size.
2. No fixed capacity.
3. No need to resize an array.
4. Enqueue and Dequeue are O(1) when front and rear
   references are maintained.

DISADVANTAGES OF LINKED LIST QUEUE
-----------------------------------
1. Extra memory for the next reference.
2. Nodes are not stored contiguously.
3. More complex than an array implementation.
4. Extra object allocation is required for every node.


====================================================================
                    INTERVIEW IMPORTANT POINTS
====================================================================

1. QUEUE follows FIFO:

   FIFO = First In, First Out

   Example:

   enqueue: 10 → 20 → 30

   dequeue() → 10


2. In a queue:

   INSERTION  → REAR
   DELETION   → FRONT


3. ARRAY QUEUE:

   Use a CIRCULAR ARRAY to efficiently reuse empty spaces.

   enqueue() → O(1)
   dequeue() → O(1)
   peek()    → O(1)


4. LINKED LIST QUEUE:

   front → first node
   rear  → last node

   enqueue() → add at rear → O(1)
   dequeue() → remove from front → O(1)
   peek()    → front element → O(1)


5. WHY DO WE NEED BOTH FRONT AND REAR?

   front → tells us where to remove
   rear  → tells us where to insert

   Without rear, finding the last node in a linked list
   would require O(n) traversal.


6. IMPORTANT EMPTY CONDITION:

   Linked List:

   front == null

   When the last element is removed:

   front = null
   rear = null


7. STACK vs QUEUE:

   Stack → LIFO
   Queue → FIFO


8. COMMON QUEUE OPERATIONS:

   enqueue() → Insert
   dequeue() → Delete
   peek()    → View front
   isEmpty() → Check empty


====================================================================
*/