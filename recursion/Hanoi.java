package recursion;

public class Hanoi {
    public static void Hanoi1(int n, String Source, String Helper, String Dest) {
        // Base case
        if (n == 1) {
            System.out.println("Disk " + n + " moved from " + Source + " to " + Dest);
            return;
        }

        // Move n-1 disks from Source to Helper using Dest as a temporary pole
        Hanoi1(n - 1, Source, Dest, Helper);

        // Move nth disk from Source to Destination
        System.out.println("Disk " + n + " moved from " + Source + " to " + Dest);

        // Move n-1 disks from Helper to Destination using Source as a temporary pole
        Hanoi1(n - 1, Helper, Source, Dest);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks

        Hanoi1(n, "S", "H", "T");
    }
}
