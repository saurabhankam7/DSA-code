package Queue;

import java.util.Queue;

public class Queue1 {
    /**
     * Node
     */
    public class Node {
    
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    /**
     * queueq1
     */
    public class queueq1 {
    
        Node head;
        int rear=-1;
        public boolean isempty(){
            if(rear==-1){
                return -1;
            }
        }
        public void enquey(int data){
            Node addnode= new Node(data);
            if (isempty()) {
                head=addnode;
                rear++;
            }
            Node CurrentNode=head;
            while (CurrentNode.next !=null) {
                CurrentNode=CurrentNode.next;
            }
            CurrentNode.next=addnode;
            rear++;
        }
        public void dequeue(){
            if (isempty()) {
                System.out.println("sorry queue is empty");
                return;
            }
            head=head.next;
        }
    }
    public static void main(String[] args) {
        
    }
}
