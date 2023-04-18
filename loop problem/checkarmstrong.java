import java.util.Scanner;
import static java.lang.Math.*;
public class checkarmstrong {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int rem,sum=0,p=0,count=0,q,w;
        w=n;
        q=n;
        while(n>0)
        {
            n/=10;
            count++;
        }
        while(q>0)
        {
            rem=q%10;
            for(int i=1;i<=count;i++)
            {
                p=rem*p;
            }
            sum=sum+p;
            q/=10;
        }
        if(sum==w)
        System.out.println("armstrong number");
        else
        System.out.println(" not armstrong number");
    }
}
