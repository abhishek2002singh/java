import java.util.Scanner;

public class fibonnaci {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int x=0;
        int y=1;
        int sum=0;
        for(int i=0;i<n;i++)
        {
             System.out.println(x);
             sum=x+y;
             x=y;
             y=sum;
        }

    }
}
