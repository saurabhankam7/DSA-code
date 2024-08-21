package Conditional;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        int age=5;
        if (age>18) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
        if (age%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        Scanner Sc= new Scanner(System.in);
        int button = Sc.nextInt();
        if (button==1) {
            System.out.println("hola");
        } else if (button==2) {
            System.out.println("hello");
        }else if (button==3) {
            System.out.println("namaste");
        }else {
         System.out.println("invalid");   
        }
    }
}
