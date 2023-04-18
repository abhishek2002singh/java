import java.util.Scanner;

public class lcm {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        int c,m=1;
        if(a>b)
        {
             c=a;
        }
        else
        {
            c=b;
        }
        for(int i=2;i<=c;i++)
        {
            if(a%i==0&&b%i==0)
            {
                m=i;
            }
        }
        int l=(a*b)/m;
        System.out.println("lcm is = " + l);
    }
}
