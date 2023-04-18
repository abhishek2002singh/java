import java.util.Scanner;

public class primenumber {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int number=src.nextInt();
        int j;
        for(int i=2;i<=number;i++)
        {
            for(j=2;j<i;j++)
            
                if(i%j==0)
                break;
                if(j==i)
                System.out.println(i);
            
        }
    }
}
