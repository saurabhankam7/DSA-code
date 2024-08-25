public class char1 {
    public static void main(String[] args) {
        char ch='A';
        int []arr= new int[69];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=ch+i;
        }
        for (int i = 0; i < arr.length; i++) {
        System.out.print((char)+arr[i]);
        }
        
    }
}
