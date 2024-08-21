package Stack;

public class Stack1 {

    /**
     * Node class
     */
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Stack class
     */
    public static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void Push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public static int Pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static void printstack(){
            if (isEmpty()) {
                System.out.println("Stack is empty");
                
            }
            int top =head.data;
            while (head.next !=null) {
                System.out.print(top+" -> ");
                head= head.next;
            }
            System.out.print("null");
        }

        public static int Peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
        
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.Push(10);
        stack.Push(20);
        stack.Push(30);

        System.out.println(stack.Peek()); // Should print 30
        // System.out.println(stack.Pop());  // Should print 30
        System.out.println(stack.Peek()); // Should print 20
        stack.printstack();
    }
}
