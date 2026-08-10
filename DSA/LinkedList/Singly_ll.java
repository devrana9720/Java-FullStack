import java.util.*;

public class Singly_ll {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Singly_ll list = new Singly_ll();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        System.out.println("Singly Linked List:");
        list.printList();
    }
}


/*
====================================================================
             SINGLY LINKED LIST vs DOUBLY LINKED LIST
====================================================================

| Feature              | Singly Linked List      | Doubly Linked List       |
|----------------------|------------------------|--------------------------|
| Pointers per Node    | 1 (next)               | 2 (prev + next)          |
| Traversal             | Forward only           | Forward + Backward      |
| Memory                | Less                   | More                     |
| Previous Node         | Cannot access directly | Can access directly      |
| Reverse Traversal     | Difficult              | Easy                     |
| Implementation        | Simpler                | More complex             |
| Extra Pointer         | No                     | prev pointer             |
| Search                | O(n)                   | O(n)                     |

====================================================================

ADVANTAGES OF SINGLY LINKED LIST
---------------------------------
1. Uses less memory because each node has only one pointer.
2. Simple to implement.
3. Easy to traverse in the forward direction.
4. Good when only forward traversal is required.


DISADVANTAGES OF SINGLY LINKED LIST
------------------------------------
1. Traversal is possible only in the forward direction.
2. Cannot directly access the previous node.
3. Deleting a node may require maintaining a pointer
   to the previous node.
4. Reverse traversal is difficult.


ADVANTAGES OF DOUBLY LINKED LIST
---------------------------------
1. Can traverse in both forward and backward directions.
2. Previous node can be accessed directly.
3. Deletion is easier when we already have a reference
   to the node.
4. Reverse traversal is easy.


DISADVANTAGES OF DOUBLY LINKED LIST
------------------------------------
1. Requires more memory because every node has two pointers.
2. Implementation is more complex.
3. More pointer/reference updates are required during
   insertion and deletion.


NODE STRUCTURE
--------------

Singly Linked List:

[DATA | NEXT] -> [DATA | NEXT] -> [DATA | NULL]


Doubly Linked List:

NULL <- [PREV | DATA | NEXT] <-> [PREV | DATA | NEXT] -> NULL


IMPORTANT
---------
Singly Linked List:
Node = data + next

Doubly Linked List:
Node = data + prev + next

====================================================================
*/