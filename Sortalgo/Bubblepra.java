package Sortalgo;

public class Bubblepra {
    public static void main(String[] args) {
        int array1[] = { 55, 70, 10, 13, 20, 54, 101 };
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length - i - 1; j++) {
                if (array1[j] > array1[j + 1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
