import java.util.Scanner;

public class printarmstrong {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int sum=0,rem,p=1,q,w,r,count=0,temp=1,h=1,i;
        for(p=1;p<=n;p++)
        {
             q=p;
             r=p;
             while(r>0)
             {
                r/=10;
                count++;

             }
             for(i=0;i<=count;i++)
             {
                rem=q%10;
                for(int j=1;j<=count;j++)
                {
                    temp=temp*rem;
                }
                sum=sum+temp;
                q/=10;
                temp=1;
             }
             i=h;
             if(p==sum)
             System.out.println(sum);
             count=0;
             sum=0;
        }

    }
}
