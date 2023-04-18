import java.util.Scanner;

public class sumofnumber {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int number=src.nextInt();
        int sum=0;
        for(int i=0;i<=number;i++)
        {
            sum=sum+2*i;
        }
        System.out.println("sum of even number is = " + sum);
    }
}
