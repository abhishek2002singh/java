import java.util.Scanner;

public class tringle11 {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.println("enter a number for printing pattern");
        int n=src.nextInt();
        char ch;
        for(int i=1;i<=n;i++)
        {
            ch='A';
            for(int j=1;j<=2*n-1;j++)
            {
                if(j>=6-i&&j<=4+i)
                {
                    System.out.print(" " +(char) ch + " ");
                    int p=j<n ? ch++:ch--;
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
