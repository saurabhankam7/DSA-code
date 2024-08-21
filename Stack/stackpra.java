package Stack;

public class stackpra {
    /**
     * Node class
     */
    public static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Stackoperation class
     */
    public static class Stackoperation {
        Node head;  // Now non-static

        public boolean isEmpty() {
            return head == null;
        }

        public void push(String data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public String pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return null;
            }
            String top = head.data;
            head = head.next;
            return top;
        }

        public String peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return null;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stackoperation s1 = new Stackoperation();  // No need to create an outer class instance
        s1.push("Madrid");
        s1.push("Barcelona");
        s1.push("Valencia");
        s1.push("Sevilla");

        System.out.println(s1.peek()); // Output: Sevilla
        System.out.println(s1.pop());  // Output: Sevilla
        System.out.println(s1.pop());  // Output: Valencia
        System.out.println(s1.peek()); // Output: Barcelona
    }
}
