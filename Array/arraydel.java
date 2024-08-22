package Array;

public class arraydel {
    public static void main(String[] args) {
        int array1[] = { 55, 70, 44, 828, 10, 20 };
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 44) {
                array1[i] = array1[i + 1];
                
            }
            System.out.println(array1[i]);
        }
    }
}
