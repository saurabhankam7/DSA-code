package OOPS;

abstract class Animal {
    abstract void walk();

    public void walk1() {
        System.out.println("fdsfdsf");
    }
}

class Horse extends Animal { 
    public void walk() {
        System.out.println("walk on 4 legs");
    }
}

/**
 * InnerAbstraction1
 */
class Chicken extends Animal { 
    public void walk() {
        System.out.println("walk on 2 legs"); 
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.walk1();
        Chicken c1 = new Chicken(); 
        c1.walk();
    }
}
