package recursion;

public class calpowerlogn {
    public static int calpower1(int x, int n) {
        
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            int calpow = calpower1(x, n / 2) * calpower1(x, n / 2);
            return calpow;
        }else {
            int calpow = calpower1(x, n / 2) * calpower1(x, n / 2) * x;
            return calpow;
        }


    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int a = calpower1(x, n);
        System.out.println(a);
    }
}
