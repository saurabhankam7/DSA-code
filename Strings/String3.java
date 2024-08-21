package Strings;
public class String3 {
    public static void main(String[] args) {
        String s1 = "sdfdf";
        char[] arr = s1.toCharArray(); // Correct way to convert a string to a char array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
