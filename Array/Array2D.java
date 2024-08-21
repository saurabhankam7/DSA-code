package Array;
import java.util.*;;
public class Array2D {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int rows= Sc.nextInt();
        int cols=Sc.nextInt();
        int [][]array1= new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array1[i][j]=Sc.nextInt();
            }
        }
        System.out.println("find element");
        int k= Sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                if(k==array1[i][j]){
                    System.out.println("number found at"+(i+1)+" row and "+(j+1)+" col");
                }
            }
            System.out.println("");
        }
    }
}
