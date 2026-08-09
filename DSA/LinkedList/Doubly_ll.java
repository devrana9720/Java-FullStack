import java.util.*;
public class Doubly_ll {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
            newNode.prev=current;
        }
    }

    public void printList(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    //Delete from head
    public void deleteFromHead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
    }

    //Delete from tail
    public void deleteFromTail(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.prev.next=null;
    }

    //Delete from a specific position
    public void deleteFromPosition(int position){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(position==0){
            deleteFromHead();
            return;
        }
        Node current=head;
        for(int i=0;i<position && current!=null;i++){
            current=current.next;
        }
        if(current==null){
            System.out.println("Position out of bounds");
            return;
        }
        if(current.next!=null){
            current.next.prev=current.prev;
        }
        if(current.prev!=null){
            current.prev.next=current.next;
        }
    }
    public static void main(String args[]){
        Doubly_ll list = new Doubly_ll();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        System.out.println("Doubly Linked List:");
        list.printList();
    }
}
