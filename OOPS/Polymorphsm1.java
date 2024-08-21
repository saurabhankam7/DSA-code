package OOPS;

/**
 * InnerPolymorphsm1
 */
class Student {
    public void PrintInfo(String Name){
        System.out.println("Hola "+Name);
    }

    public void PrintInfo(String Name, int age){
        System.out.println("Hola "+Name+" age is"+age);
    }

    public void PrintInfo(String Name, int age, int roll){
        System.out.println("Hola "+Name+" age is "+age+" roll no"+roll);
    }
    
}

public class Polymorphsm1 {
    public static void main(String[] args) {
        Student S1= new Student();
        S1.PrintInfo("Saurabh");
        S1.PrintInfo("Saurabh",22,4);
        S1.PrintInfo("Saurabh",22);

    }
}
