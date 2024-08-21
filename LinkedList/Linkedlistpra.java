package LinkedList;

public class Linkedlistpra {
    Node head;

    /**
     * Node
     */
    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void AddFirst(String data) {
        Node NewNode = new Node(data);
        if (head == null) {
            head = NewNode;
            return;
        }
        NewNode.next = head;
        head = NewNode;
    }

    public void AddLast(String data) {
        Node NewNode = new Node(data);
        if (head == null) {
            head = NewNode;  // Fix: Assign the new node to head if the list is empty.
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = NewNode;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;  // Fix: Handle case where there's only one node.
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {  // Traverse until the second last node.
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void PrintList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {  // Fix: Loop to traverse all nodes.
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // Update nodes
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    public static void main(String[] args) {
        Linkedlistpra l1 = new Linkedlistpra();
        l1.AddFirst("hello");
        l1.AddFirst("hola");
        l1.AddLast("amigos");
        l1.PrintList();  // Output: hola -> hello -> amigos -> null
        l1.reverseList();
        l1.PrintList();
    }
}
