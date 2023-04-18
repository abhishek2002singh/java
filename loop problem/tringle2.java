import java.util.Scanner;

public class tringle2 {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        
        System.out.println("enter a number for pattern print");
        int n=src.nextInt();
        for(int i= 1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j>=6-i)
                System.out.print("*");
                else
               System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
