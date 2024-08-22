package recursion;

public class fibb {
    public static void fibb(int a,int b, int n){
    if (n==0) {
        return;
    }
    int c= a+b;
    System.out.println(c);
    fibb(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1,n=7;
        System.out.println(a);
        System.out.println(b);
        fibb(a,b,n-1);
    }
}
