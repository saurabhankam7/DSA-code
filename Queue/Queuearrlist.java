package Queue;

import Array.array1;

public class Queuearrlist {
    public Class Queue{
        static int a[];
        static int size;
        static int rear=  -1;
        Queue(int n){
            a= new int[n];
            this.size= n;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void add(int n){
            if (rear==size-1) {
                System.out.println("arra is full");
                return;
            }
            rear++;
            a[size-1]=n;
        }
        public static int remove(){
            if (isEmpty()) {
                System.out.println("array is empty");
                return -1;
            }
            int front = a[0];
            for (int i = 0; i < rear; i++) {
                a[i]=a[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if (isEmpty()) {
                System.out.println("array is empty");
                return -1;
            }
            return a[0];
        }

    }
    public static void main(String[] args) {
        
    }
}
