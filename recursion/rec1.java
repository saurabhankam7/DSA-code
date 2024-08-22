package recursion;

/**
 * rec1
 */
public class rec1 {
    public static void Consecative(int n){
        if (n==50){
            return;
        }
        System.out.println(n);
        Consecative(n+1);
    }
    public static void sumofnatural(int a,int sum){
        if(a==0){
            System.out.println(sum);
            return ;
            
        }
        sum=sum+a;
        sumofnatural(a-1, sum);
    }
    public static void main(String[] args) {
        Consecative(1);
        sumofnatural(10,0);
    }
}
