package recursion;

public class xpown {
    public static int calculatepow(int x, int n){
        if(n==0){
            return 1;
        }
        if (x==0) {
            return 0;
        }
        int calpow1=calculatepow(x, n-1);
        int pow1= x*calpow1;
        return pow1;
    }
    public static void main(String[] args) {

        System.out.println(calculatepow(2, 5));
    }
}
