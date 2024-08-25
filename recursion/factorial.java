package recursion;

public class factorial {
    public static int fact(int n,int sum){
        if (n==0) {
            return sum;
        }
        sum *=n;
        return fact(n-1, sum);
    }
    public static void main(String[] args) {
        System.out.println(fact(5,1));
    }
}
