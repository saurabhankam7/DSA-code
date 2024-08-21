package Hashmap;
import java.util.*;;
public class Hashmap1 {
    public static void main(String[] args) {
        HashMap <Integer,String> HM1= new HashMap<>();
        HM1.put(1, "hola");
        HM1.put(2,"hello");
        HM1.put(3, "adios");
        System.out.println(HM1);
        if (HM1.containsKey(1)) {
            System.out.println("key is present");
        }
        System.out.println(HM1.get(1));
        int arr[]={10,20,30,40};
        for (int val : arr) {
            System.out.println(val);
        }
        for (Map.Entry<Integer,String> e:   HM1.entrySet()) {
            System.out.print(e.getKey()+":");
            System.out.println(e.getValue());
        }
        Set <Integer> keys= HM1.keySet();
        for (Integer integer : keys) {
            System.out.println("keys is"+integer+" value"+HM1.get(integer));
        }
    }
}
