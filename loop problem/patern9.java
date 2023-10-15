import java.util.Scanner;

public class patern9 {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        int m;
        int p;
        for(int i=1;i<=n;i++)
        {
             m=1;
             for(int j=1;j<=2*n-1;j++)
             {
                     if(j>=(i)&&j<=(2*n)-i){
                     System.out.print(m);
                      p= j<n? m++:m--;
                     }
                     else
                     System.out.print(" ");
                    }
            System.out.print("\n");

        }
    }
}
