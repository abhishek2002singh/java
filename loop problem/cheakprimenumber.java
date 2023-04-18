import java.util.Scanner;

public class cheakprimenumber {
    
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        int number=src.nextInt();
        int i;
        for(i=2;i<number;i++)
        {
            if(number%i==0)
            break;
        }
        if(i==number)
        {
            System.out.println("prime number");
        }
        else
        {
            System.out.println("not prime number");
        }
    }
}
