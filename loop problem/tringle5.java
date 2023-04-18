import java.util.Scanner;

public class tringle5 {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.print("enter anumber");
        int n=src.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*n;j++)
            {
                if(j>=6-i&&j<=4+i)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
