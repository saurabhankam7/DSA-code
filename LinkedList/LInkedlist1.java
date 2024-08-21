package LinkedList;

public class LInkedlist1 {
    /**
     * Node
     */
    private int size;
    LInkedlist1(){
        size=0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    private Node head;

    // Add a new node at the beginning
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Add a new node at the end
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        size++;
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("cant delete node");
            return;
        }
        
        head= head.next;
        size--;
    }

    public void deletelast(){
        if(head==null){
            System.out.println("cant delete node");
            return;
        }
        Node lastNode= head.next;
        Node SecondLast= head;
        while (lastNode.next !=null) {
            lastNode=lastNode.next;
            SecondLast=SecondLast.next;
        }
        SecondLast.next=null;
        size--;
    }

    public int getsize(){
        return size;
    }

    // Main method to test the LinkedList
    public static void main(String[] args) {
        LInkedlist1 LL = new LInkedlist1();
        LL.addFirst("55");
        LL.addLast("99");
        LL.addFirst("sadsad");
        LL.addFirst("sadsad");LL.addFirst("sadsad");LL.addFirst("sadsad");
        System.out.println(LL.getsize());
        LL.deleteFirst();
        LL.deletelast();
        LL.printList(); // Expected output: 55 -> 99 -> null
        System.out.println(LL.getsize());

    }




}
