package OOPS;

/**
 * Inter1 interface
 */
interface Inter1 {
    void walk();
    void eat();
}

/**
 * Horse class implementing Inter1 interface
 */
class Horse implements Inter1 {
    @Override
    public void walk() {
        System.out.println("The horse has 4 legs.");
    }

    @Override
    public void eat() {
        System.out.println("The horse is eating.");
    }
}

/**
 * Interface1 main class
 */
public class Interface1 {
    public static void main(String[] args) {
        Horse H1 = new Horse();
        H1.eat();
        H1.walk();
    }
}

