package Array;
import java.util.ArrayList;
import java.util.Arrays;
public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList <Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(90);
        list1.add(23);
        list1.add(2,33);
        System.err.println(list1);
        System.err.println(list1.size());
        System.out.println(list1.get(2));
        System.out.println(list1.set(1, 99));
        System.err.println(list1);

    }
}
