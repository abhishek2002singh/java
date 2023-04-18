import java.util.*;
public class  primenumber1 {
    boolean isPrime=true;
    public static void print(int n)
    {
        boolean isPrime=true;
        
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(int i) {
        return false;
    }
    public static void main(String args[]) {
        boolean isPrime=true;
        Scanner src=new Scanner(System.in);
       // int num=src.nextInt();
        print(15);
    }
}
