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

    Node top;

    // Push operation
    public void push(int value) {

        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    public int pop() {

        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;
        top = top.next;

        return value;
    }

    // Peek operation
    public int peek() {

        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    // Check whether stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Main method
    public static void main(String[] args) {

        Implementation_by_linkedlist s =
                new Implementation_by_linkedlist();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top: " + s.peek());

        System.out.println("Pop: " + s.pop());
        System.out.println("Pop: " + s.pop());

        System.out.println("Top: " + s.peek());

        System.out.println("Is Empty: " + s.isEmpty());
    }
}


/*
==========================================================
          STACK: ARRAY vs LINKED LIST
==========================================================

| Feature              | Array Stack              | Linked List Stack       |
|----------------------|--------------------------|-------------------------|
| Memory               | Contiguous               | Non-contiguous          |
| Size                 | Fixed in basic version   | Dynamic                 |
| Push                 | O(1)                     | O(1)                    |
| Pop                  | O(1)                     | O(1)                    |
| Peek                 | O(1)                     | O(1)                    |
| Overflow             | Possible when full       | No fixed-size overflow* |
| Extra Memory         | Less                     | More (next reference)   |
| Implementation       | Simple                   | Slightly complex        |

* Linked List can still run out of memory.


ADVANTAGES OF ARRAY
-------------------
1. Simple implementation.
2. Less memory overhead.
3. Better cache locality.
4. Good when maximum size is known.


DISADVANTAGES OF ARRAY
----------------------
1. Fixed capacity in basic implementation.
2. Stack Overflow when array becomes full.
3. Resizing is required if dynamic capacity is needed.


ADVANTAGES OF LINKED LIST
-------------------------
1. Dynamic size.
2. No need to specify capacity beforehand.
3. Push and Pop are O(1).
4. No fixed array space is required.


DISADVANTAGES OF LINKED LIST
----------------------------
1. Extra memory is required for the 'next' reference.
2. Nodes are not stored contiguously.
3. Slightly more complex implementation.


INTERVIEW POINT
---------------
Stack is an ADT that follows LIFO
(Last In, First Out).

It can be implemented using:
1. Array
2. Linked List

The Stack ADT remains the same.
Only the underlying implementation changes.

==========================================================
*/