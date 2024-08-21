package OOPS;

/**
 * Shape
 */
class Shape {

    Shape(){
        System.out.println("hello from shape");
    }
}

/**
 * Triangle
 */
class Triangle extends Shape {
    Triangle(){
        System.out.println("hello from Triangle");
    }
    public double Area(int base, int Height){
        return 0.5*base*Height;
    }
    public int peri(int s1, int s2, int s3){
        return s1+s2+s3;
    }
}

/**
 * Equilateral
 */
class Equilateral extends Triangle{
    Equilateral(){
        System.out.println("hello from Equilateral Triangle");
    }
    public int peri(int s1){
        return s1*3;
    }
    
}

public class inheritance1 {
    public static void main(String[] args) {
        Equilateral E1= new Equilateral();
        System.out.println(E1.Area(20, 50));
        System.out.println(E1.peri(10));
        System.out.println(E1.peri(10, 20, 3));
    }
}
