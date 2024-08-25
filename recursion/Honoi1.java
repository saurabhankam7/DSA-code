package recursion;

public class Honoi1 {
    public static void Honoi(int n, String Source, String Helper, String Dest){
        if(n==1){
            System.out.println(n+" Desc Moved from "+Source+" TO "+Dest);
            return;
        }
        Honoi(n-1, Source, Dest, Helper);
        System.out.println(n+" Desc Moved from "+Source+" TO "+Dest);
        Honoi(n-1, Helper, Source,Dest);
    }
    public static void main(String[] args) {
        int n=3;
        Honoi(n,"S","H","D");
    }
}
