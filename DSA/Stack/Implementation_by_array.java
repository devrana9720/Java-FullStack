public class Implementation_by_array {

    int[] stack;
    int top;

    // Constructor
    public Implementation_by_array(int size) {
        stack = new int[size];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return stack[top--];
    }

    // Peek operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }

    // Check whether stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Main method
    public static void main(String[] args) {

        Implementation_by_array s = new Implementation_by_array(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());

        System.out.println("Top element: " + s.peek());

        System.out.println("Is empty: " + s.isEmpty());
    }
}