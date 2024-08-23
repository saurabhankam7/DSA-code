package recursion;

public class calpower {
    public static int calpower1(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpown=x*calpower1(x, n-1);

        return xpown;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int a=calpower1(x,n);
        System.out.println(a);
    }
}
