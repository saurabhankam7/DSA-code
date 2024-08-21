package Array;
import java.util.*;;
public class array1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n= Sc.nextInt();
        int []arr= new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=Sc.nextInt();
        }
        System.out.println("find for key");
        int k= Sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (k==arr[i]) {
                System.out.println("element Find at"+(i+1)+"position");
            }
        }
    }
}
