package Strings;
import java.util.*;;
public class string1 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        String name= Sc.nextLine();
        String lname=Sc.nextLine();
        System.out.println("Hello "+name+" "+lname);
        System.out.println(name.length()+lname.length());
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        if (name.compareTo(lname)==0) {
            System.out.println("hello");
        }
        else{
            System.out.println("bye");
        }
        if (name == lname) {
            System.out.println("sdsfsd");
        }else{
            System.out.println("sdsd");
        }
    }
}
