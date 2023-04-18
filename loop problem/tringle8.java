import java.util.Scanner;

public class tringle8 {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.print("enter anumber");
        int n= src.nextInt();
        int m;
        for(int i=1;i<=n;i++)
        {
          m=1;
            for(int j=1;j<=2*n-1;j++)
            {
                    if(j>=(n+1)-i&&j<=(n-1)+i){
                    System.out.print(m);
                    int p= j<n? m++:m--;
                    }
                    else
                    System.out.print(" ");
                 
                
            }
            System.out.print("\n");
        }
    }
}
