import java.util.Scanner;

public class tringle13 {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.print("enter a number");
        int n=src.nextInt();
        char ch;
        for(int i=1;i<=n;i++)
        {
            ch='A';
            for(int j=1;j<=2*n-1;j++)
            {
                if(j<=(n+1)-i||j>=(n-1)+i)
                {
                    System.out.print((char) ch);
                }
                else
                {
                    System.out.print(" ");
                }
                int p=j<n ? ch++:ch--;
            }
            System.out.print("\n");
        }
    }
}
