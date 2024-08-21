package Hashmap;
import java.util.*;;
public class Hashmap2 {
    public static void main(String[] args) {
        HashMap <String,Integer> HM= new HashMap<>();
        HM.put("madrid", 15);
        HM.put("Ac Milan", 7);
        HM.put("Liverpool", 6);
        HM.put("bayern", 6);
        System.out.println(HM);
        for (Map.Entry<String,Integer> e :  HM.entrySet()) {
            System.out.print(e.getKey()+":");
            System.out.println(e.getValue());
        }

        Set <String> s1= HM.keySet();
        for (String string1 : s1) {
            System.out.println("key="+string1+" value"+HM.get(string1));
        }
    }
}
