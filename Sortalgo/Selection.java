package Sortalgo;

public class Selection {
    public static void main(String[] args) {
        int array1[] = { 55, 70, 44, 828, 10, 20 };

        for (int i = 0; i < array1.length ; i++) {
            int smallest = i;
            for (int j = i+1; j < array1.length; j++) {
                if (array1[j]<array1[smallest]) {
                    smallest=j;
                }

            }
            int temp = array1[smallest];
            array1[smallest]=array1[i];
            array1[i]=temp;
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
