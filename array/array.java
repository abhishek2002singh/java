import java.util.Scanner;

public class array {
    public static void main(String args[]) {
      Scanner src=new Scanner(System.in);
      int n=src.nextInt();
      int x=0,y=1,sum=0;
      for(int i=0;i<=n;i++)
      {
        System.out.println(x +" ");
        int temp;
        temp=y;
        sum=x+y;
        y=sum;
        x=temp;
      }
    }
}
