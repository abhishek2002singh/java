import java.util.*;

public class primenum {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        int j=0;
        for(int i=a;i<=b;i++)
        {
            for( j=2;j<i;j++)
            
                if(i%j==0)
                {
                    break;
                }
                if(i==j)
                  {
                    System.out.println(j + " ");
                  }
            
        }
    }
}
