import java.util.Scanner;

public class addnaturalnumber {
    public static int sumnatural(int n) {
        int sum=0;
        if(n==0)
        {
            return sum;
        }
        sum=n+sumnatural(n-1);
        return sum;
    }
   public static void main(String args[]) {
    Scanner src=new Scanner(System.in);
    int n=src.nextInt();
    //sumnatural(n);
    System.out.println( sumnatural(n));
   } 
}
