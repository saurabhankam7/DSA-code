package recursion;

public class Hanoi {
    public static void Hanoi1(int n, String Source, String Helper, String Dest) {
        // Base case
        if (n==1) {
            System.out.println("moved "+n+" disk from "+Source+" to "+Dest);
            return;
        }
        Hanoi1(n-1, Source, Dest, Helper);
        System.out.println("moved "+n+" disk from "+Source+" to "+Dest);
        Hanoi1(n-1, Helper , Source, Dest);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks

        Hanoi1(n, "S", "H", "T");
    }
}
