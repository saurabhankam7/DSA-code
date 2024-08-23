package Queue;


/**
 * queue1
 */
public class queue1 {
    public class  Node {
    
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public class QueueOp{
        static Node Head=null;
        static Node Tail=null;
        public boolean isEmpty(){
            return Head==null && Tail==null;
        }
        public void Enqueue(int data){
            Node addNode= new Node(data);
            if (isEmpty()) {
                Head=Tail=addNode;
                return;
            }
            Tail.next= addNode;
            Tail= addNode;
        }
        public int DeQueue(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return 0;
            }
            int data=Head.data;
            Head= Head.next;
            if (Head==null) {
                Tail=null;
            }
            return data;
        }
        public int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return 0;
            }
            return Head.data;
        }
    }


    public static void main(String[] args) {
        queue1 outer = new queue1();
        QueueOp Q1= outer.new QueueOp();
        Q1.Enqueue(11);
        Q1.Enqueue(20);
        Q1.peek();
    }
}