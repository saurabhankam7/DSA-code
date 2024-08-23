package recursion;

public class fibb1 {
    public static void funfibb(int a, int b, int n){
        if (n==0) {
            return;
        }
        int c=0;
        c= a+b;
        System.out.println(c);
        funfibb(b, c, n-1);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("0");
        System.out.println("1");
        funfibb(0,1,n);
    }
}
