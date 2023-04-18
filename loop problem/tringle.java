import java.util.Scanner;

public class tringle {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter the number for printing pattern");
        int n=src.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
