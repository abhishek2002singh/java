import java.util.Scanner;

public class hcf {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        int c,r=1;
        if(a<b)
        {
           c=b;
        }
        else
        {
            c=a;
        }
        for(int i=1;i<=c;i++)
        {
            if(a%i==0&&b%i==0)
            {
                r=i;
            }
        }
        System.out.println("hcf = " + r);
    }
}
