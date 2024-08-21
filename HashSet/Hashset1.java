package HashSet;
import java.util.HashSet;
import java.util.Iterator;
/**
 * Hashset1
 */
public class Hashset1 {

    public static void main(String[] args) {
        HashSet <Integer> set= new HashSet<>();
        set.add(20);
        set.add(30);
        set.add(40);

        
        //search
        if (set.contains(20)) {
            System.out.println("true");
        }
        if (!set.contains(200)) {
            System.out.println("true");
        }

        set.remove(20);
        if (set.contains(20)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        set.add(20);
        set.add(20);
        set.add(20);
        System.out.println(set.size());
        System.err.println(set);
        //iterator;
        Iterator it= set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}