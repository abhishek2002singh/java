import java.util.Scanner;

public class tringle14 {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter a number");
        int n=src.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j>=i&&j<=i||j==1||i==n)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}
