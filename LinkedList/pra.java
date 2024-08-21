package LinkedList;

/**
 * pra
 */
public class pra {
    /**
     * Node
     */
    public class Node {
    
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    private Node head;

    public void addFirst(String data){
        Node currentNode= new Node(data);
        if(head==null){
            head=currentNode;
            return;
        }
        currentNode.next=head;
        head=currentNode;
    }
    public void addLast(String data){
        Node addNode = new Node(data);
        if(head==null){
            head=addNode;
            return;
        }
        Node curNode= head;
        while (curNode.next != null) {
            curNode= curNode.next;
        }
        curNode.next=addNode;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("cant Print list");
            return;
        }
        head= head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("cant Print list");
            return;
        }
        Node lastNode=head.next;
        Node Secondlast= head;
        while (lastNode.next != null) {
            lastNode=lastNode.next;
            Secondlast=Secondlast.next;
        }
        Secondlast.next=null;
    }
    public void FindElement(String data){
        Node currentNode=head;
        int counter=0;
        while (currentNode != null) {
            if(currentNode.data.equals(data)){
                System.out.println("found data at"+(counter+1));
                return;
            }
            counter++;
            currentNode= currentNode.next;
        }
    }
    public void PrintList(){
        if(head==null){
            System.out.println("cant Print list");
            return;
        }
        Node currentNode= head;
        while (currentNode != null) {
            System.out.print(currentNode.data+" -> ");
            currentNode= currentNode.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        pra p1= new pra();
        p1.addFirst("hello");
        p1.addFirst("hi");
        p1.addFirst("hola");
        p1.addLast("namastara");
        p1.addFirst("konichiwa");
        p1.addLast("hi");
        p1.addFirst("namaste");
        p1.deleteFirst();
        p1.deleteLast();
        p1.PrintList();
        p1.FindElement("hola");
    }
}