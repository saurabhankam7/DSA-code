package OOPS;

/**
 * Aniaml
 */
class Aniaml {
    String legs;
    String voice, type;
    public void PrintWrite() {
        System.out.println("He is "+this.type);
        System.out.println("he has:"+this.legs+" legs");
        System.out.println("he can:"+this.voice);
    }
    Aniaml(String name, int legs){
        System.out.println(name+"  "+legs);
    }
}



public class Class1 {
    public static void main(String[] args) {
        Aniaml A1= new Aniaml("Dog",4);
        // A1.legs="Four";
        // A1.voice="Barks";
        // A1.type="Dog";
        // A1.PrintWrite();

        // Aniaml A2= new Aniaml();
        // A2.legs="Two";
        // A2.voice="Shout";
        // A2.type="Monkey";
        // A2.PrintWrite();

    }
}
