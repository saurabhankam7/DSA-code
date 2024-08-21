package LinkedList;
import java.util.*;;
public class Collect1 {
    public static void main(String[] args) {
        LinkedList <Integer> l1=new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(21);
        l1.add(133);
        l1.add(132);
        l1.add(1213);
        System.out.println(l1);
        l1.addFirst(23);
        l1.addLast(22);
        System.out.println(l1);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        l1.removeFirst();
        System.out.println(l1);

    }
}
