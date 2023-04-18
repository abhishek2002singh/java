import java.util.Scanner;

public class pattern10 {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter a number for pattern");
        int n=src.nextInt();
        int m;
        for(int i=1;i<=n;i++)
        {
            m=1;
            for(int j=1;j<=2*n-1;j++)
            {
                if(j<=5-i||j>=3+i)
                {
                    System.out.print(m);
                    
                }
                else
                {
                    System.out.print(" ");
                }
                int p= j<n? m++:m--;
            }
            System.out.print("\n");
        }
    }
}
