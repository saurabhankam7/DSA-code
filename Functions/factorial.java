package Functions;

public class factorial {
    public static int fact(int a){
        int n=1;
        while (a>0) {
            n=n*a;
            a--;
        }
        return n;
    }
    public static void main(String[] args) {
        int a=5;
        if(a<0){
            System.out.println("cant determinf factorial ");
        }else{
            System.err.println(fact(a));
        }

    }
}
