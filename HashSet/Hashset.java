package HashSet;
import java.util.*;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(55);
        set1.add(13);
        set1.add(48);
        set1.add(99);

        if(set1.contains(89)){
            set1.remove(99);
        }else{
            System.out.println("Isn't Conatain");

        }

        Iterator it= set1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
